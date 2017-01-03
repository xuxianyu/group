###新闻服务
#####功能：
1:通过rss、或者爬虫对一些门户网站的信息进行抓取、丢到缓存、并且落地到mysql
 
#####选用技术：
1:spring+spring data+spring mvc+shiro等等
<br/>
2:内置jetty、采用lombok来简化bean部分代码
<br/>
3:采用restful风格接口、数据格式统一为json
<br/>
4:数据缓存在mongodb、落地到mysql
#####文件结构:
1:doc目录:存放和本服务有关的文档。比如：sql脚本、接口、开发规范等
<br/>
2:src目录:存放业务代码、配置、单元测试等
<br/>
3:web目录:本系统主要是提取数据推送数据、暴露部分接口。所以此目录放置web.xml

