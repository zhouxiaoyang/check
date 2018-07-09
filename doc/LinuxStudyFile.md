###Linux基本操作

>* netstat -anp|grep 8080  查看端口占用情况
>* ps -ef|grep tomcat  查看进程
>* tar -zxvf nginx.tar.gz  解压压缩文件
>* nohup java -jar test.jar & 
>*  nohup 意思是不挂断运行命令,当账户退出或终端关闭时,程序仍然运行
  当用 nohup 命令执行作业时，缺省情况下该作业的所有输出被重定向到nohup.out的文件中
  除非另外指定了输出文件。
>* nohup java -jar test.jar >temp.txt &  这种方法会把日志文件输入到你指定的文件中，没有则会自动创建  
>* df -l  查看系统磁盘使用情况    
>* find / -name xx  查找文件


###nginx 安装及操作

####安装nginx
```
1. 安装依赖包
yum -y install gcc zlib zlib-devel pcre-devel openssl openssl-devel

2. 下载nginx tar包到/usr/local/nginx/下
mkdir /usr/local/nginx
cd  /usr/local/nginx
wget http://nginx.org/download/nginx-1.13.7.tar.gz
tar -zxvf nginx-1.13.7.tar.gz

3. 安装nginx(使用默认设置安装)
cd /usr/local/nginx/nginx-1.13.9
./configure
make
make install
```

####nginx 命令
```
1. 启动nginx 
/usr/local/nginx/sbin/nginx 

2. 停止nginx
/usr/local/nginx/sbin/nginx  -s stop
/usr/local/nginx/sbin/nginx  -s quit

3. 重启nginx
/usr/local/nginx/sbin/nginx  -s reload

4. 测试配置文件
/usr/local/nginx/sbin/nginx -t

```