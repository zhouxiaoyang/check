# API

###笔录列表

```
GET /check/notes/list
```

参数

```
无
```

返回

```
{
	"code": 0,
	"msg": "成功! ",
	"data": {
		"noteData": [{
			"id": "62ba6054756542e58d70b582e065d78d",
			"times": "1",
			"number": "0001",
			"startTime": "2018-01-01"
		}, {
			"id": "62ba6054756542e58d70b582e065d78d",
			"times": "1",
			"number": "0001",
			"startTime": "2018-01-01"
		}],
		"sum": 2
	}
}
```


###新建笔录

```
POST /check/notes/save
```

参数

```

String id; 

String  times;  次数

String  number;  谈话编号或名称

String startTime; 开始时间

String endTime;    结束时间

String surveyName;  调查人姓名

String workAgency;   调查人工作单位

String notesName;  记录人姓名

String notesAgency;  记录人工作单位

String beSurveyName;   被调查人

String sex;  性别

String age;  年龄

String ethnic;  民族

String political; 政治面貌

String surveyAgency;  被调查人工作单位

String job;  职务

String tel;  联系电话

String noteInfo;  笔录正文

```

返回

```
{
  "code": 0,
  "msg": "成功",
  "data": null
}
```

###再次提问

```
POST /check/notes/update
```

参数

```
String id; 

String  times;  次数

String  number;  谈话编号或名称

String startTime; 开始时间

String endTime;    结束时间

String surveyName;  调查人姓名

String workAgency;   调查人工作单位

String notesName;  记录人姓名

String notesAgency;  记录人工作单位

String beSurveyName;   被调查人

String sex;  性别

String age;  年龄

String ethnic;  民族

String political; 政治面貌

String surveyAgency;  被调查人工作单位

String job;  职务

String tel;  联系电话

String noteInfo;  笔录正文

```

返回

```
{
  "code": 0,
  "msg": "成功",
  "data": null
}
```

###笔录详情

```
POST /check/notes/info
```

参数

```
noteId:62ba6054756542e58d70b582e065d78d
```

返回
```
{
	"code": 0,
	"msg": "成功!!",
	"data": {
		"id": "62ba6054756542e58d70b582e065d78d",
		"times": null,
		"number": null,
		"startTime": null,
		"endTime": null,
		"surveyName": null,
		"workAgency": null,
		"notesName": null,
		"notesAgency": null,
		"beSurveyName": null,
		"sex": null,
		"age": "111",
		"ethnic": null,
		"political": null,
		"surveyAgency": null,
		"job": null,
		"tel": null,
		"noteInfo": null
	}
}
```
