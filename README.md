# YRHY
## 项目地址
`https://github.com/jialin43/YRHY`
## Mongodb
### Mongodb启动
```
mongod --dbpath /var/lib/mongo --logpath /var/log/mongodb/mongod.log  --bind_ip=120.95.133.8 --port=27017
```
### Mongodb 连接
```
mongodb://120.95.133.8:27017/?compressors=zlib&readPreference=primary&gssapiServiceName=mongodb&appname=MongoDB%20Compass&ssl=false
```
### 脚本
在`./db/`中，分为助剂ZJ和染料RL分别导入即可