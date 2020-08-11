<template>
  <div class="page-container">
    <!--工具栏-->
    <div class="toolbar" style="float:left;padding-top:10px;padding-left:15px;">
      <el-form :inline="true" :model="filters" :size="size">
        <el-form-item>
          <el-input v-model="filters.label" placeholder="用户名"></el-input>
        </el-form-item>
        <el-form-item>
          <kt-button icon="fa fa-search" :label="$t('action.search')" perms="sys:role:view" type="primary"
                     @click="findPage(null)"/>
        </el-form-item>
        <el-form-item>
          <kt-button icon="fa fa-plus" :label="$t('action.add')" perms="sys:user:add" type="primary"
                     @click="handleAdd"/>
        </el-form-item>
      </el-form>
    </div>

    <!--表格内容栏-->
    <kt-table :height="350" permsEdit="sys:user:edit" permsDelete="sys:user:delete"
              :data="pageResult" :columns="columns"
              @findPage="findPage" @handleEdit="handleEdit" @handleDelete="handleDelete">
    </kt-table>
    <!--新增编辑界面-->
    <el-dialog :title="operation?'新增':'编辑'" width="40%" :visible.sync="dialogVisible" :close-on-click-modal="false">
      <el-form :model="dataForm" label-width="80px" :rules="dataFormRules" ref="dataForm" :size="size"
               label-position="right">
        <el-form-item label="ID" prop="id" v-if="false">
          <el-input v-model="dataForm.id" :disabled="true" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="用户名" prop="username">
          <el-input v-model="dataForm.username" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input v-model="dataForm.password" type="password" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="昵称" prop="nickname">
          <el-input v-model="dataForm.nickname" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="dataForm.email" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="手机" prop="mobile">
          <el-input v-model="dataForm.mobile" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="地区" prop="address">
          <div>
            <v-distpicker
              :province="dataForm.province"
              :city="dataForm.city"
              :area="dataForm.area"
              align="left"
              @selected="onSelected"
            >
            </v-distpicker>
          </div>
        </el-form-item>

        <el-form-item label="详细地址" prop="address">
          <el-input v-model="dataForm.address" auto-complete="off" placeholder="详细地址"></el-input>
          <!--          <el-input v-model="dataForm.address" auto-complete="off"></el-input>-->
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button :size="size" @click.native="dialogVisible = false">{{$t('action.cancel')}}</el-button>
        <el-button :size="size" type="primary" @click.native="submitForm" :loading="editLoading">
          {{$t('action.submit')}}
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import KtTable from "@/views/Core/KtTable"
  import KtButton from "@/views/Core/KtButton"
  import {format} from "@/utils/datetime"
  import VDistpicker from 'v-distpicker'

  export default {
    components: {
      KtTable,
      KtButton,
      VDistpicker
    },
    data() {
      let reg = /^[A-Za-z0-9]{6,15}$/
      var validateInput = (rule, value, callback) => {
        if (!reg.test(value)) {
          callback(new Error('用户名只能包括数字字母的组合，长度为6-15位'))
        } else {
          callback()
        }
      }
      return {
        size: 'small',
        filters: {
          label: ''

        },

        columns: [
          {prop: "id", label: "ID", minWidth: 40},
          {prop: "username", label: "用户名", minWidth: 50},
          {prop: "nickname", label: "昵称", minWidth: 50},
          {prop: "mobile", label: "手机", minWidth: 100},
          {prop: "email", label: "邮箱", minWidth: 150},
          {prop: "province", label: "省", minWidth: 100},
          {prop: "city", label: "市", minWidth: 100},
          {prop: "area", label: "区(县)", minWidth: 100},
          {prop: "address", label: "详细地址", minWidth: 120},
          {prop: "gmtCreate", label: "", minWidth: 100},
        ],
        pageRequest: {pageNum: 1, pageSize: 10},
        pageResult: {},

        operation: false, // true:新增, false:编辑
        dialogVisible: false, // 新增编辑界面是否显示
        editLoading: false,
        dataFormRules: {
          username: [
            {required: true, message: '请输入用户名', trigger: 'blur'},
            {validator:validateInput, trigger: 'blur'}
          ],
          password: [
            {required: true, message: '请输入密码', trigger: 'blur'}
          ],
          nickname: [
            {required: true, message: '请输入昵称', trigger: 'blur'}
          ],
          email: [
            {type:'email', message: '请输入正确邮箱', trigger: 'blur'}
          ],

        },
        // 新增编辑界面数据
        dataForm: {
          id: 0,
          name: '',
          password: '123456',
          nickname: '小明',
          province: '',
          city: '',
          area: '',
          address: '西北农林科技大学信息工程学院',
          email: 'swan1861@163.com',
          mobile: '12345678',
          status: 1,
          gmtCreate: null,
        }
      }
    },
    methods: {
      // 获取分页数据
      findPage: function (data) {
        if (data !== null) {
          this.pageRequest = data.pageRequest
        }
        this.pageRequest.columnFilters = {name: {name: 'name', value: this.filters.label}}
        this.$api.user.findPage(this.pageRequest).then((res) => {
          this.pageResult = res.data
          //this.findUserRoles()
        }).then(data != null ? data.callback : '')
      },
      // 加载用户角色信息
      findUserRoles: function () {
        this.$api.role.findAll().then((res) => {
          // 加载角色集合
          this.roles = res.data
        })
      },
      // 批量删除
      handleDelete: function (data) {
        this.$api.user.batchDelete(data.params).then(data != null ? data.callback : '')
      },
      // 显示新增界面
      handleAdd: function () {
        this.dialogVisible = true
        this.operation = true
        this.dataForm = {
          id: 0,
          username: '',
          password: '',
          nickname: '',
          address: '',
          email: '',
          mobile: '',
          type: 1,
          province: '',
          city: '',
          area: '',

        }
      },
      // 显示编辑界面
      handleEdit: function (params) {
        console.log(params)
        this.dialogVisible = true
        this.operation = false
        this.dataForm = Object.assign({}, params.row)
      },
      // 编辑
      submitForm: function () {
        this.$refs.dataForm.validate((valid) => {
          if (valid) {
            this.$confirm('确认提交吗？', '提示', {}).then(() => {
              this.editLoading = true
              let params = Object.assign({}, this.dataForm)

              this.$api.user.save(params).then((res) => {
                this.editLoading = false
                if (res.code == 200) {
                  this.$message({message: '操作成功', type: 'success'})
                  this.dialogVisible = false
                  this.$refs['dataForm'].resetFields()
                } else {
                  this.$message({message: '操作失败, ' + res.msg, type: 'error'})
                }
                this.findPage(null)
              })
            })
          }
        })
      },

      dateFormat: function (row, column, cellValue, index) {
        return format(row[column.property])
      },
      // 处理表格列过滤显示
      initColumns: function () {
        this.columns = [
          {prop: "id", label: "ID", minWidth: 40},
          {prop: "username", label: "用户名", minWidth: 50},
          {prop: "nickname", label: "昵称", minWidth: 50},
          {prop: "mobile", label: "手机", minWidth: 100},
          {prop: "email", label: "邮箱", minWidth: 150},
          {prop: "province", label: "省", minWidth: 100},
          {prop: "city", label: "市", minWidth: 100},
          {prop: "area", label: "区(县)", minWidth: 100},
          {prop: "address", label: "详细地址", minWidth: 120},
          {prop:"gmtCreate", label:"创建时间", minWidth:120, formatter:this.dateFormat}
        ];
      },
      onSelected(data) {
        this.dataForm.province = data.province.value;
        this.dataForm.city = data.city.value;
        this.dataForm.area = data.area.value;
      },
    },
    mounted() {
      this.initColumns()
    }
  }
</script>

<style scoped>

</style>
