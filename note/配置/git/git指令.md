# 一、基础指令

1. git add XXX	将XXX文件存入暂存区

   还可以使用：git add * 添加所有文件到暂存区

2. git status 查看当前状态

3. git diff 查看改动

4. git config 查看配置

5. git commit -m "说明"  提交改动

6. git log 查看版本

   git log --pretty=行数 	显示指定行数

7. git reset --hard head^ 回退到上一个版本 

   1. 几个^回退几个版本，如果回退100个版本可以head~100

   2. 回退到指定版本, --hard 版本号

      版本号只需要写前几位就可以了

8. git reflog 查看输入的所有命令

9. git rm 删除文件

   如果删除了文件，或者通过rm命令删除文件，git会知道，通过git status可以了解删除了那些文件，如果需要删除，则需要通过：
   
   ```
   git rm XXX.XX
   ```
   
   删除文件 再提交即可

# 二、连接github

注:origin 后面的为自己的地址

如果通过SSH连接远程仓库需要产生公钥私钥，并且在github中设置

```
ssh-keygen -t rsa -C "youreamil"
```

产生的公钥私钥会在用户目录下的SSH中

1. 连接远程仓库

   ```
   git remote add origin git@github.com:zhangluoyachao/superLuoZai.git
   ```

2. 上传至github

   首次上传需要：

   ```
   git push -u origin master
   ```

   之后只需要

   ```
   git push origin master
   ```

3. 从远程仓库克隆

   ```
   git clone git@github.com:zhangluoyachao/superLuoZai.git
   ```

   之后更新只需要

   ```
   git pull
   ```