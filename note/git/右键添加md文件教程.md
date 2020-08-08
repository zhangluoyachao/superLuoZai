1. 下载Typora，会自动往注册表中添加几个文件

2. 新建一个.reg后缀的文件，将以下代码写入并运行

   ```
   Windows Registry Editor Version 5.00
   [HKEY_CLASSES_ROOT\.md\ShellNew]
   "NullFile"=""
   "FileName"="template.md"
   ```

   

