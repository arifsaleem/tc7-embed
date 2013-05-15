tc7-embed
=========

Simple POC to test how convenient it is to embed TC7 in a standalone application.

The approach has two main classes in the src folder, 

* The BasicServerSetup shows how it can be used with a manually specified Root Context and an anonymous servlet which
can be used in tests.

* The ExtendedServerSetup specifies a BaseDir for tomcat where you can place your JSP files and even a web.xml if needed.

* Both approaches fail to load the annotated Servlets in the servlet package. That is the next step to take care of.

Reference:
http://tomcat.apache.org/tomcat-7.0-doc/api/org/apache/catalina/startup/Tomcat.html


