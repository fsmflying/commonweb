maven web项目创建成功后，如果执行Maven update操作会发现项目的默认Web配置存在问题．
比如说
1.没有引用javax.servlet-api，要在pom.xml中添加依赖如下：
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>test</scope>
		</dependency>
2.jdk的版本问题,要修改pom.xml中的配置，添加如下配置节，以指定编译和运行的jdk版本
	<build>
		<finalName>MavenCommonWeb01</finalName>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.3</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>

3.Project facets配置存在问题，它的属性不能通过eclipse直接修改，要修改项目下的.settings/org.eclipse.wst.common.project.facet.core.xml
修改内容如下：
<?xml version="1.0" encoding="UTF-8"?>
<faceted-project>
  <fixed facet="wst.jsdt.web"/>
  <installed facet="wst.jsdt.web" version="1.0"/>
  <installed facet="java" version="1.8"/>
  <installed facet="jst.web" version="3.1"/>
</faceted-project>


4. web.xml命名空间修改
maven项目创建时，web.xml文件的使用了dtd 2.3,当修改了jsp的版本后，可以删除它们
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
		http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	id="WebApp_ID" version="3.1">
	
	
</web-app>


