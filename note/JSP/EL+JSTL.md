## 一、EL表达式

EL表达式：Expression Language 表达式语言，用于替换JSP中脚本的表达式代码（<%=>）

### 1、语法

``` jsp
${el表达式}
```

### 2、应用场景

1. **获取四大作用域中的值**

   ${作用域.key}

   ```jsp
   ${sessionScope.el}
   ==>
   session.getAttribute("el")
   ```

   作用域可以省略，以作用域顺序取值，谁有值取谁，如果都没有，不显示（不为null直接不显示）

   ```jsp
   ${el}
   ```

   底层实现就是

   

2. **获取对象的属性值**

   1. 先将对象存入作用域
   2. 通过调用$.对象.属性名

   ```jsp
   ${u.id}
   ```

   **注：底层原理是通过类的get方法获取，如果没有提供get方法就会报运行时异常，属性notfound**

3. **获取请求的参数**

   1. param

      替换getParameter

      ```
      ${param.key}
      ==>
      request.getParameter("key")
      ```

   2. paravalues

      替换getParameterValues

### 3、运算符

1. . 运算符号：获取对象属性

   ${u.uname}

2. [ ] 运算符：用于根据下标获取数组或集合中的对象

   ${list[0].uname}

3. ==或者eq：判断两值是否相等，返回boolean类型

4. ！=或者ne：不等于

5. \> 或者gt：大于

6. \< 或者lt：小于

7. <= 或者le：小于等于

8. \>= 或者ge：大于等于

9. && 或者 and

10. ||或者or

11. ！或者not

12. 三目运算

13. empty：判断为空 ${empty user}

14. +-*/

## 二、JSTL

jsp的标准标签库，可以通过JSTL实现jsp页面动态数据的获取或展示

常跟EL表达式结合使用

使用之前需要导入相关依赖：jstl1.2.jar

### 1、分类

```jsp
<%@taglib prefix="c" uri="地址" %>
```

![image-20200807163319546](images/image-20200807163319546.png)

类似于JAVA 导包，IDEA可以自动导

1. 核心标签库：JSTL中的基本标签

   set out remove if choose foreach

   ```jsp
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   ```

   核心标签库地址为：core

   注:引入核心标签库一般前缀写c可以任意

2. 格式化标签库：通过JSTL做数据格式化（日期、数字）

   ```jsp
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   ```

   

3. 函数标签：JSTL针对于字符处理的一些函数

注：这三种情况任何一种使用之前都需要引入标签库

`<%taglib uri = "地址" prefix = "前缀"%>`

### 2、核心标签库 core

1. **set：赋值**

   1. 用于给四大作用域存值 相当于 `作用域.setAttribute(key,value)`

    ```jsp
   <c:set var="key" value="value" scope="作用域"></c:set>
    ```

   2. 给对象的属性赋值

   ```jsp
   <c:set value="值" property="属性名" target="对象"></c:set>
   ```

   **注：**

   * **对象必须在作用域中存在，如果直接写对象名 target="user"则表示一个字符串对象**

   * __要使其表达user对象需要配合EL表达式：target="${user}"__

     

2. **remove：删除某一个作用域的值**

   ```jsp
   <c:remove var="one" scope="request"></c:remove>
   ```

   **注：如果没有scope则表示删除所有作用域中的值**

   ```jsp
   <c:remove var="one"></c:remove>
   ```

   

3. **out：向页面输出内容**

   1. 输出指定内容，可以固定，可以输出作用域中的内容

      ```jsp
      <c:out value="" default=""></c:out>
      ```

      注：当value 为空时，显示默认值

   2. ```jsp
      <c:out value="" default="" escapeXml="是否渲染"></c:out>
      ```

      如果值为HTML标签，不会被渲染，需要escapeXml = “y” 才能被渲染成HTML标签

      注：escapeXml可以设置成 y/n yes/no

   

4. **if：类似java if**

   语法：

   ```jsp
   <c:if test="条件">
       执行的操作
   </c:if>
   ```

   1. 可以标签嵌套其他标签

      ```jsp
      <p <c:if test=""></c:if>> </p>
      ```

   2. 正常使用，同java，可以使用EL表达式的三目代替

      

5. **choose 类似 java 中if else**

   语法：

   ```jsp
   <c:choose>
       <c:when test="条件1"></c:when> <%--if--%>
       <c:when test="条件2"></c:when> <%--if else--%>
       <c:when test="条件3"></c:when>
       <c:when test="条件4"></c:when>
       <c:otherwise></c:otherwise> <%--其他条件--%>
   </c:choose>
   ```

   

6. **forEach ：循环，可以表示foreach和普通for循环**

   语法：

   ```jsp
   <c:forEach var="" items="" step="" begin="" end="" varStatus="">
   </c:forEach>
   ```

   var:类似java foreach中的临时变量 或者 for中的i
   begin:遍历开始的下标
   end:遍历结束的下标
   step：步长，隔几个遍历
   items：用于指定遍历的集合或数组
   varStatus：遍历对象的状态 count行号 index索引值

   1. 常规for

      ```jsp
      <!--
      实现常规 for 循环
      -->
      <c:forEach var="i" begin="0" end="10" step="1" varStatus="vs">
          ${i}
          ${vs.count}
      </c:forEach>
      等同于
      for (int i = begin; i <= end; i += step) {
      
      }
      ```

      **注：**

      **1. count行号表示遍历了的第几次，index表示索引值，类似于i （var可以省略）**
      **2. count是从1开始，index从begin开始**

   2. for each

      ```jsp
      <c:forEach var="临时变量" items="${数组或者集合}">
          ${临时变量}
      </c:forEach>
      ```



### 3、格式化标签库 fmt

1. 数字类型

   ```jsp
   格式化数字
   <fmt:formatNumber var="" value="" pattern=""
                     maxFractionDigits="" type="">
   
   </fmt:formatNumber>
   ```

   var:声明变量
   value:指定格式化的数字
   maxFractionDigits:指定保留几位小数，四舍五入
   type:类型 number 数字 percent百分比 currency货币
   **注：先转换类型，再保留小数**

   ```
   value="0.98854" maxFractionDigits="2" type = "percent"
   ==>98.85
   ```

   pattern: 可以指定数字格式 一般货币会使用 0表示数字
   如：pattern="$.00 q"
   
   
   
2. 日期类型

   1. 字符串转日期

      ```jsp
      <fmt:parseDate value="2009-04-15" pattern="yyyy-mm-dd"/>
      ```

   2. 日期转字符串

      ```jsp
      <fmt:formatDate value="${date}" pattern="yyyy-mm-dd"/>
      ```