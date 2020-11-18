# 作业管理平台

> JavaEE课程结课项目，一个作业管理系统

- 前后端分离
- 前端采用jQuery，后端采用SpringBoot
- ORM层使用Mybatis



## 接口

> 下面是本项目的服务端的接口



### 教师

- 注册

  path: `http://localhost:8080/techer/register`

  | param     | value  | 备注     |
  | --------- | ------ | -------- |
  | username  | String | 昵称     |
  | password  | String | 密码     |
  | name      | String | 真实姓名 |
  | teacherID | Long   | 教工号   |

  return:

  true:

  ~~~json
  {
      "code": 0,
      "msg": "注册成功",
      "data": null
  }
  ~~~

  false

  ~~~json
  {
      "code": -1,
      "msg": "该教工号已被注册",
      "data": null
  }
  ~~~

- 登录

  path:`http://localhost:8080/login/teacher`

  请求参数

  ~~~json
  {
      "teacherID": 1111,
      "password": "12d3"
  }
  ~~~

  return:

  true:

  ~~~json
  {
      "code": 0,
      "msg": "登录成功",
      "data": null
  }
  ~~~

  false:

  ~~~json
  {
      "code": -1,
      "msg": "密码错误",
      "data": null
  }
  ~~~

- 添加作业

  path:`http://localhost:8080/teacher/addHomework`

  request：

  ~~~json
  {
      "title": "第5️五次作业",
      "content": "这是作业内容",
      "createTime": "2020-06-18 17:18:33"
  }
  ~~~

  return:

  true:

  ~~~json
  {
      "title": "第5️五次作业",
      "content": "这是作业内容",
      "createTime": "2020-06-18 17:18:33"
  }
  ~~~

- 查看所有作业

  path: `http://localhost:8080/teacher/getAllHomework`

  return:

  ~~~json
  {
      "code": 0,
      "msg": "查询成功",
      "data": [
          {
              "id": 1,
              "title": "第一次作业",
              "content": "这是作业内容",
              "createTime": "2020-06-18 17:01:47",
              "updateTime": null
          },
          {
              "id": 2,
              "title": "第一次作业",
              "content": "这是作业内容",
              "createTime": "2020-06-18 00:00:00",
              "updateTime": null
          },
          {
              "id": 3,
              "title": "第二次作业",
              "content": "这是作业内容",
              "createTime": "2020-06-18 00:00:00",
              "updateTime": null
          },
          {
              "id": 4,
              "title": "第二次作业",
              "content": "这是作业内容",
              "createTime": "2020-06-18 17:18:33",
              "updateTime": null
          }
      ]
  }
  ~~~

- 查看指定作业

  path:`http://localhost:8080/teacher/reviewHomework`

  request:

  ~~~json
  {
      "id":1
  }
  ~~~

  return:

  ~~~json
  {
      "code": 0,
      "msg": "查询成功",
      "data": {
          "id": 1,
          "title": "第一次作业",
          "content": "这是作业内容",
          "createTime": "2020-06-18 17:01:47",
          "updateTime": null
      }
  }
  ~~~

- 修改作业：

  path: `http://localhost:8080/teacher/updateHomework`

  request:

  ~~~json
  {
      "id": 3,
      "title": "第三次作业",
      "content": "这是第三次作业内容",
      "updateTime": "2020-06-18 17:41:30"
  }
  ~~~

  return:

  ~~~json
  {
      "code": 0,
      "msg": "修改成功",
      "data": {
          "id": 3,
          "title": "第三次作业",
          "content": "这是第三次作业内容",
          "createTime": "2020-06-18 00:00:00",
          "updateTime": "2020-06-18 17:41:30"
      }
  }
  ~~~



### 学生

- 注册

  Path:`http://localhost:8080/student/register`

  request:

  ~~~json
  {
  	"username": "dzw",
  	"password": "123",
  	"name": "dzw",
  	"studentID": 1112
  }
  ~~~

  returen

  true:

  ~~~json
  {
      "code": 0,
      "msg": "注册成功",
      "data": null
  }
  ~~~

  false:

  ~~~json
  {
      "code": -1,
      "msg": "该学号已被注册",
      "data": null
  }
  ~~~

- 登录

  path:`http://localhost:8080/login/student`

  request:

  ~~~json
  {
      "studentID": 1111,
      "password": "123"
  }
  ~~~

  return:

  true:

  ~~~json
  {
      "code": 0,
      "msg": "登录成功",
      "data": null
  }
  ~~~

  false:

  ~~~json
  {
      "code": -1,
      "msg": "密码错误",
      "data": null
  }
  ~~~

- 提交作业

  path:`http://localhost:8080/student/submit`

  request:

  ~~~json
  {
      "studentId": "1111",
      "homeworkId": "1",
      "title": "这是第一次作业",
      "content":"这是第一次作业内容",
      "answer": "A",
      "submitTime": "2020-06-18 18:00:10"
  }
  ~~~

  return:

  ~~~json
  {
      "code": 0,
      "msg": "提交成功",
      "data": null
  }
  ~~~

- 查看作业

  path:`http://localhost:8080/student/reviewAnswer`

  request:

  ~~~json
  {
      "studentId": 1111,
      "homeworkId": 1
  }
  ~~~

  return:

  true:

  ~~~json
  {
      "code": 0,
      "msg": "查询成功",
      "data": {
          "id": 1,
          "studentId": 1111,
          "homeworkId": 1,
          "title": "这是第一次作业",
          "content": "这是第一次作业内容",
          "answer": "B",
          "submitTime": "2020-06-18 18:12:45"
      }
  }
  ~~~

- 修改作业

  path:`http://localhost:8080/student/updateAnswer`

  request:

  ~~~json
  {
      "id": 1,
      "answer": "B",
      "submitTime": "2020-06-18 18:12:45"
  }
  ~~~

  return

  ~~~json
  {
      "code": 0,
      "msg": "修改成功",
      "data": null
  }
  ~~~

  
