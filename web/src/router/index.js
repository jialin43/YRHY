import Vue from 'vue'
import Router from 'vue-router'
import Cookies from "js-cookie"
import Login from '@/views/Login'
import NotFound from '@/views/Error/404'
import Home from '@/views/Home'
import api from '@/http/api'
import store from '@/store'
import {getIFramePath, getIFrameUrl} from '@/utils/iframe'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '主页',
      component: Home
    }
  ]
})
