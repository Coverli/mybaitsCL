@echo off

git add .
 git commit -m "bat�������Զ�����:%date:~0,10%,%time:~0,8%"
::  git commit -m "%commitMessage%"
git branch -M main
git push -u origin main
@echo ���ͳɹ�

SET daoTime=5
:dao
set /a daoTime=daoTime-1
ping -n 2 -w 500 127.1>nul
:: cls
echo �ϴ�Git��� ,����ʱ�˳�: %daoTime%��
if %daoTime%==0 (exit) else (goto dao)
