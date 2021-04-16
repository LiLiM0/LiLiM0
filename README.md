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
## 课程管理与大章管理互相跳转
## 大章管理保存和查询功能关联courseId
## 大章管理与小节管理互相跳转
## 小节管理保存和查询功能关联courseId，chapterId
## 保存节时，更新课程总时长
## 增加自定义mapper
## 增加事务配置
## 增加了时长格式化fliter formatSecond
## 分类表设计和基本代码生成
## 分类列表查询与显示，左右两个表格
## 两级分类的新增修改删除
## 对当前一级分类中选中的表格触发一次点击事件，一级刷新二级分类
# 4.8
## 集成树型展示插件zTree
## ztree数据改为分类所有记录
## 保存课程时，同时保存课程分类
## 增加课程分类关联表，一门课程可以属于多个分类
## 编辑课程时，加载课程分类树，并设置勾选
## 课程内容表设计与基本代码生成
## 利用setInterval完成自动保存功能
## 增加js日期格式化方法
## 课程管理增加自定义排序
## 菜单隐藏掉大章和小节
## sessionStorage的key改成常量
## 增加全局自定义样式style.css,表格内文字上下居中
## 增加讲师管理功能
## 讲师界面布局优化
## 课程与讲师关联
# 4.9
## 课程列表中显示讲师信息
## 课程名称字体自适应
## 增加file模块，用于文件上传和存储
## 文件上传功能开发：spring+vue基本的文件上传功能，上传讲师头像
## 文件上传功能开发：增加springboot静态资源配置，配置文件访问路径
## 文件上传功能开发：文件上传实时显示与保存
## 文件上传功能开发：讲师头像显示优化
## 文件上传功能开发：使用单独的文件上传按钮
## 文件上传功能开发：增加上传文件类型的判断
## 文件上传功能开发：制作文件上传公共组件
## 修复不能连续上传同一个文件的bug
## 文件上传功能开发：文件表设计与基本代码生成
## 文件上传功能开发：上传文件时保存文件记录
## 文件上传功能开发：去掉文件管理的新增、修改、删除功能
## 文件上传功能开发：增加文件大小格式化过滤器
## 文件上传功能开发：文件按用途分类保存
## 文件上传功能开发：文件上传成功后返回值的处理
# 4.10
## 文件上传功能开发：课程管理和小节管理（图片及视频）使用文件组件
## 文件上传功能开发：自动获取视频时长
## 文件上传功能开发：增加课程内容文件管理，用于富文本框中插入图片或视频
## 修复course，section，teacher页面中关于文件组件中inputId的赋值
## 修复file组件中selectFile，id的值改为变量
## 文件上传功能开发，增加课程内容文件管理，用于富文本框中插入图片或视频
# 4.12
## 用户管理与登录：用户表设计和基本代码生成
## 用户管理与登录：增加用户名是否已存在校验
## 增加自定义业务异常
## 用户管理与登录：解决从登录页面跳到控台主页时，侧边栏失效的问题
## 用户管理与登录：基本的登录功能开发，校验用户名密码
## 用户管理与登录：登录后前端保存登录信息并显示
## 将SessionStorage的set和get打包个方法，写在tool里面
## 用户管理与登录：增加退出登录功能，清空前后端的会话缓存
# 4.13
## 用户管理与登录：增加记住登录信息功能,安全加固，本地缓存保存密码明文
## 用户管理与登录：集成图形验证码kaptcha
## 用户管理与登录：页面显示验证码及刷新验证码
## 用户管理与登录：登录增加验证码校验
## 解决每次ajax请求，对应的sessionId不一致的问题
## ！！！用户管理与登录：集成redis，图形验证码的存储冲session改为redis（不过是用的别人的服务器，要是挂了要撤回这个提交）
## 验证码太糊了，老是输错，改为高清验证码
## ！！！用户管理与登录：生成登录token并存储到redis中；退出登录时删除token
## 解决的上传视频时长获取值为NaN的bug（参考：https://www.cnblogs.com/wangqiao170/p/9359760.html）
## 用户管理与登录：基于vue路由的登录拦截
## 用户管理与登录：在请求header中统一增加token
## 用户管理与登录：在gateway中增加登录拦截器
## 用户管理与登录：gateway实现控台登录拦截功能
# 4.14
## 通用权限管理：资源表的设计与基本代码的生成
## 通用权限管理：资源树的保存
## 通用权限管理：资源树的显示
## 通用权限管理：增加基本角色管理功能
## 通用权限管理：增加角色资源管理表，生成持久层和服务端代码
## 通用权限管理：点击【关联资源】按钮时，加载资源树
## 通用权限管理：点击资源树模态框【保存】按钮时，保存角色资源关联表
## 通用权限管理：打开资源树模态框时，加载角色资源关联数据，并自动勾选树节点
## 通用权限管理：增加角色用户关联表，生成持久层和服务端代码
## 通用权限管理：点击【关联用户】按钮时，加载所有用户，弹出角色用户关联
## 通用权限管理：点击用户模态框【保存】按钮时，保存角色用户关联表
## 通用权限管理：打开用户模态框时，加载用户角色关联数据
## 通用权限管理：登录时，读取当前登录用户所属的角色的所有资源
## 通用权限管理：前端界面权限拦截，完成用户管理
## 通用权限管理：前端界面权限拦截，完成所有界面控制
## 通用权限管理：前端界面权限拦截，增加路由权限判断
## 通用权限管理：增加后端接口权限拦截
## 前台网站开发：增加web模块 使用命令：vue create web
## 前台网站开发：改了web的端口号为 8081，避免俩个端口冲突vue随机使用端口
## 前台网站开发：增加bootstrap-4.4.1的js.css
## 前台网站开发：集成album模板
## 前台网站开发：将顶部和底部提取成the-header和the-footer组件
## 前台网站开发：增加路由配置router.js,增加网站首页index.vue
## 前台网站开发：导航条改为bootstrap导航条组件 文档：https://v4.bootcss.com/docs/components/navbar/
## 前台网站开发：导航条美化：菜单名称修改；增加container布局；样式改为dark
## 前台网站开发：集成fontawesome图标
## 前台网站开发：底部文案修改，大屏文案修改
# 4.15
## 前台网站开发：增加【新上好课】后端接口 测试地址：http://127.0.0.1:9002/business/web/course/list-new
## 前台网站开发：首页显示新上好课真实数据 
## 前台网站开发：bootstrap4图片自适应：使用img-fluid
## 前台网站开发：进到web目录下，安装axios：npm install axios --save
## 优化all.sql表 初始user表，账号admin/密码admin（数据中显示加密后的，所以初始化也改为加密的）
## 前台网站开发：课程card美化，增加【最新上线】和【好课推荐】，分别依据上架时间和订阅人数倒序排列的响应式桌面，使用rem代替px
## 增加vue校验配置.eslintrc.js
## 前台网站开发：增加课程card组件the-course
## 前台网站开发：课程card组件增加等级显示
## 增加过滤器filter.js,在main.js中部署全局过滤
## 课程列表页面开发：增加课程列表页【全部课程】，并增加路由
## 课程列表页面开发：课程列表页调用后端接口显示真实数据
## 课程列表页面开发：后端接口只能查询已发布的课程
## 课程列表页面开发：前端分页，增加分页组件
## 课程列表页面开发：加载所有分类
## 增加axios接口访问日志拦截器
## 课程列表页面开发：两级分类访问慕课网显示
## 课程列表页面开发：课程列表页面开发，点击一级分类时显示激活状态，并显示对应的二级分类，如果点击的是【全部】，则显示所有的二级分类
## 课程列表页面开发：点击二级分类时显示激活状态
## 课程列表页面开发：根据点击的分类进行课程筛选，*动态sql不只可以进行动态列查询，也可以进行动态表关联
## 课程列表页面开发：增加课程详情页面和路由
## 课程列表页面开发：增加课程后端接口，只能查询已发布的课程，包含内容、讲师、大章、小节信息
## 修复上一次提交漏掉的接口
## 课程详情页面开发：增加课程内容显示
## 课程详情页面开发：增加大章小节显示，使用d-none d-sm-inline组合：超小屏时隐藏，其它显示v-for的第二变量是索引号
## 课程详情页面开发：增加大章小节收缩和展开 注意：在v-for里写v-show，只修改属性不起作用，需要$set
# 4.16
## 课程详情页面开发:视频播放功能实现
## 课程详情页面开发:对每个大章里的小节进行排序显示
## 课程详情页面开发:只有免费的视频才可直接播放，收费视频需要登录后才能播放
## 增加会员管理页面:新增member表，在之前代码生成器的步骤后面，加上以下步骤：
1) 在resource.json中增加新资源
2) 在【资源管理】页面，配置最新的resource.json
3) 在【角色管理】页面，为相应的角色配置新的资源
4) 重新登录控台
## 增加会员管理页面:控台的会员管理，不能新增，修改，删除。可以查看会员信息，重置密码，报表统计等操作
## 会员登录注册功能开发:增加登录注册模态框，增加注册功能
## 会员登录注册功能开发:增加登录框和忘记密码框，并实现登录框、注册框、忘记密码框切换，默认显示登录框
## 会员登录注册功能开发:登录框显示验证码
## 会员登录注册功能开发:加登录功能，包含图片验证码,将admin的登录功能相关代码拷贝到会员登录，并将user替换成member
## 会员登录注册功能开发:增加h5 local缓存和session缓存
## 会员登录注册功能开发:完善【记住我】功能，会员登录名是mobile，不是loginName
## 会员登录注册功能开发:登录成功后，头部导航显示会员昵称
## 会员登录注册功能开发:增加退出登录功能
## 会员登录注册功能开发:增加短信管理，生成代码后，需要配置资源权限
## 会员登录注册功能开发:完善短信管理，只能查看
## 会员登录注册功能开发:增加发送注册短信功能,同手机号同操作1分钟内不能重复发送短信
## 会员登录注册功能开发:增加发送短信后倒计时功能,可修改countdown参数进行调试
## 会员登录注册功能开发:注册时，发送短信前，先校验会员是否存在
## 会员登录注册功能开发：注册时发送验证码前，增加手机号校验；手机号输入框失去焦点时，校验手机号
## 会员登录注册功能开发： 增加正则表达式校验工具类
## 会员登录注册功能开发：增加忘记密码功能，包含短信验证，输入框校验等
## 会员登录注册功能开发：注册时增加短信验证码校验功能,短信验证码5分钟内有效，只能验证一次
## 会员登录注册功能开发：提交注册之前，先校验所有注册输入框
## 会员登录注册功能开发：当有一个文本框校验为false时，其它不校验
## 会员登录注册功能开发：完善注册输入框校验
## 会员报名课程功能开发:新增报名表，生成服务端和持久层代码