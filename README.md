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
## 安装vue-router 3.5.1
## 增加admin界面
## 增加路由配置，访问/admin时，加载admin组件
## 增加login页面登录按钮点击事件，跳转到admin页面
## 使用mounted解决组件初始化样式的问题
## 增加welcome子组件，增加/admin/welcome子路由
## 将面包屑导航、搜索、设置删除
# 4.1
## 增加js依赖，解决navbar中，三个菜单的点击弹窗效果。js从ace/index.html复制
## 使用相对路径解决头像路径问题
## 侧边栏去掉无用的菜单
## 底部文案修改
## 增加business模块，并增加初始启动代码
## 增加大章chapter表sql，生成持久层代码
## 增加大章列表查询接口
## 增加dto层，用于controller和service层
## 增加ChapterDto
## 修改ChapterService，将返回Chapter改为返回ChapterDto
## 新增了chapter页面及子路由，并使用假数据制作表格
## 点击sidebar菜单实现页面跳转并增加激活样式
## 路由修改，去掉/admin
## 集成axios完成前后端交互
## 增加CorsConfig，解决前后端跨域的问题
## 大章页面显示真实数据
## 使用gateway路由转发，vue页面只访问gateway
## 解决gateway跨域的问题
## 使用lb://+注册中心名称作为路由转发 loadbalance
# 4.2
## 集成分页插件pagehelper
## 分页参数前后端交互
## 增加刷新功能
## 增加分页组件pagination.vue
## 大章管理页面使用分页组件，可自定义初始每页5条，最多显示8个按钮
# 4.3
## 增加新增大章功能，后端代码开发，完成前后端联调，保存成功
## 增加复制工具类CopyUtil，封装BeanUtils.copyProperties，简化实单体复制和列表复制的代码
## 增加了统一返回实体类ResponseDto，前后端代码针对ResponseDto做修改
## chapter保存成功后关闭表单，并刷新列表
## 为modal增加id属性
## 增加修改大章功能，新增和修改用同一个保存功能，通过传入的参数id有没有值来判断
## 增加删除大章功能
## 集成sweetalert2，删除时弹出确认框
## 制作toast组件，内部用sweetalert2实现
# 4.4
## 制作Loading组件，内部用jquery blockui插件实现
## 修改Toast组件的显示效果，更大气
## 制作confirm组件
## 增加工具类tool.js和校验类validator.js
## 大章保存非空和长度增加校验
## 增加后端校验工具类ValidatorUtil
## 增加统一异常处理，controllerExceptionHandler,关键字：@ControllerAdvice
## 增加日志AOP，统一日志输出
## logback增加打印日志跟踪号
## 增加generator模块，用于代码生成
## 集成freemarker
## 小节表section表结构设计
## 生成section表持久层代码
## 制作FreemarkerUtil，简化生成器的使用
## 新增ServerGenerator，用于生成后端代码：controller service dto
# 4.5
## 生成器开发：增加生成service层的代码
## 生成器开发：增加生成controller层的代码
## 生成器开发：解决controller模板中的中文业务名称和模板名称问题
## 生成器开发：增加dto生成
## 生成器开发：代码生成器和mybatis generator整合
## 增加vue多环境配置，后端地址改为读环境变量
## 生成器开发：增加生成vue界面代码
## 小节管理增删改查功能测试成功
# 4.6
## 生成器开发：前后端模板增加字段校验
## 将jquery.blockUI.min.js复制到本地，不使用cdn
## 生成器开发：通用字段的处理，id、createdAt、updatedAt、sort
## 枚举字段，表格显示中文，表单显示下拉框
## vue中增加过滤器
## 修改了一些无所谓的页面控制台报错
## 增加了枚举常量
## 增加了枚举生成器EnumGenerator
## optionKV过滤器从list改为object
## vue生成器为组件名称增加模块名作为前缀
# 4.7
## 通过生成器，完成基本的课程管理功能
## 生成器开发：前端生成器升级，增加枚举字段的生成
## 课程管理页面美化
