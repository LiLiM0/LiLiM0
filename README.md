工作日志
# 3.29 
## 创建git仓库
## 从官网下载初始spring项目压缩包 建立初始spring项目
## 增加eureka子模块作为注册模块
## 将项目改造为maven父子结构
## 解决注册中心服务启动失败问题
## 美化启动日志
## 新增system子模块
## 将system配置成最简单的SpringBoot项目
## 将system注册到eureka
# 3.30
## 新增gateway子模块，增加gateway依赖，并注册到注册中心
## 在gateway增加system路由转发配置，调试成功
## 集成Mybatis框架，启动成功
## mybatis测试成功，使用示例：http://127.0.0.1:9001/system/test
## 增加三层结构
## 使用database关联数据库
## 新增数据库脚本
## 集成热部署Devtools
## 优化mybatis日志输出
## 新建公共模块server
## system集成server模块
## 将通用配置移动到server
# 3.31
## 集成mybatis-generator
## 解决mapper.xml重复生成代码的问题
## Example使用示例（类似于sql语句中的where）
## 配置vue脚手架以及基于Bootstrap框架的ace admin
## 使用vue cli(4.5.12)新建admin项目
## 加入ace admin模板
## index.html中加入ace admin模板所需的js css
## 在App.vue中加入登录页面的元素
## 简化登录页面代码
## 增加eslintrc.js，去掉部分检查项，解决修改代码自动编译时报错：$ is not defined