maven web��Ŀ�����ɹ������ִ��Maven update�����ᷢ����Ŀ��Ĭ��Web���ô������⣮
����˵
1.û������javax.servlet-api��Ҫ��pom.xml������������£�
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>test</scope>
		</dependency>
2.jdk�İ汾����,Ҫ�޸�pom.xml�е����ã�����������ýڣ���ָ����������е�jdk�汾
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

3.Project facets���ô������⣬�������Բ���ͨ��eclipseֱ���޸ģ�Ҫ�޸���Ŀ�µ�.settings/org.eclipse.wst.common.project.facet.core.xml
�޸��������£�
<?xml version="1.0" encoding="UTF-8"?>
<faceted-project>
  <fixed facet="wst.jsdt.web"/>
  <installed facet="wst.jsdt.web" version="1.0"/>
  <installed facet="java" version="1.8"/>
  <installed facet="jst.web" version="3.1"/>
</faceted-project>
