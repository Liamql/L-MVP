# L-MVP
An Architecture for Android Applications developing based on MVP

概述
===
个人搭建使用的MVP框架

特性
===
* 通用地开发MVP架构的Android项目
* 提供base库，实现对view,presenter,model,以及application,activity,fragment和网络请求的统一管理
* 在application自定义和管理所有application的生命周期
* 使用appmanager全局管理所有的activity的添加，移除，对activity做全局操作
* 使用Dagger2提供全局注入参数，以及retrofit2,application,appmanager的全局单例，方便统一管理
* 网络端请求使用的是Retrofit2

开源库
===
Dagger2,Retrofit2,OkHttp3,ButterKnife,Gson
