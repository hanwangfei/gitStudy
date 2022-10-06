/**
 * 1.git概念：免费的，开源的分布式版本控制系统。版本控制是一种记录一个或若干文件内容变化，以便将来查阅特点版本修订情况的系统。
 * 2.集中化版本控制系统：svn，cvs,perforce        分布式版本控制系统：git bitKeeper
 * 3.git本地结构：工作区（写的文件代码）    ->git add         暂存区（打算提交还未提交）      ->git commit           本地库（每个版本的信息）
 *
 */

/**
 * 初始化本地仓库：1.创建一个文件夹       2.打开git终端,git bash    3.git init
 * 注意事项：不放在本地仓库目录的文件git不进行管理。即使放在本地仓库，也必须通过add,commit命令操作才能将文件提交到本地库交由git管理
 *
 */

/**
 * git命令
 * git --version                                                 查看git版本号
 * clear                                                         清空屏幕
 * git config --global user.name "hwf"                           设置用户名
 * git config --global user.email "3059409726@qq.com"            设置邮箱
 * git init                                                      初始化一个文件架为git仓库(初始化完成会生成一个.git隐藏目录,注意该目录下的文件不要随意删除或修改)
 * git add  文件名(demo.txt)                                      将文件存入暂存区
 * git commit -m "第一次提交测试" 文件名(demo.txt)                   将文件提交到本地库，-m用于添加注释
 * git status                                                    查看工作区和暂存区的状态
 * git log                                                       查看提交日志(如果记录过多会出现分屏效果，按B前滚，空格下一页,到尾页了现实END，退出按q)
 * git log --pretty=oneline                                      在一行上展示日志
 * git log --oneline                                             截取一部分进行展示
 * git reflog                                                    额外显示回退需要走的步数信息
 * git reset --hard  [索引]                                       前进或后退到历史版本,hard参数代表暂存区与工作区同时跟着本地库改变
 * git reset --mixed [索引]                                       前进或后退到历史版本，本地库和暂存区改变，工作区保持不动
 * git reset --soft  [索引]                                       前进或后退历史版本，本地库改变，暂存区和工作区都不动
 *
 * rm [文件名]                                                     删除工作区的文件
 * git add [文件名]                                                添加删除操作
 * git commit -m [删除文件] 文件名                                   删除本地库文件
 *
 * git reset --hard [索引]                                         找回本地库中删除的文件，其实就是滚回历史版本,或者要恢复暂存区的数据（本地已经删除且提交到暂存区，但未提交到本地库）
 *
 *  git diff 文件名                                                 比对工作区和暂存区的文件差异，按行为单位进行管理,后面不加文件名则比较所有文件,git diff后面还可以加索引号，代表暂存区和本地库的某个版本进行比较
 *
 *
 * git branch -v                                                    查看当前所有的分支的最新版本，你在哪个分支上，该分支上就会显示*
 * git branch [分支名]                                               创建新的分支
 * git checkout [分支名]                                             切换到某个分支上
 *
 * git merge 分支名                                                  该命令一般在主分支上进行，将分支合并到主分支（此时容易产生合并冲突，在同一个文件的同一个位置有不同的修改，合并时就会产生冲突。    解决办法，自己人为决定留下哪一部分，然后进行add commit,注意此时commit不要带文件名）
 *
 *
 */

/**
 * 远程库地址比较长，每次复制比较麻烦
 * https://github.com/hanwangfei/GitResp.git
 * 在git本地将地址保存，通过别名
 * git remote -v          查看别名
 * git remote add origin https://github.com/hanwangfei/GitResp.git          给远程库连接起别名叫origin，别名可以随意
 *
 * git push 远程库的别名 要推送的分支          如git push origin master,将本地库推送到远程库，如果远程库没有master分支，则会自动创建
 * git clone 远程库地址                     克隆远程库到本地,克隆操作会帮助我们初始化本地库，并将远程库的东西完全克隆到本地，还会为远程库创建别名
 * git fetch 远程库别名 分支名                抓取操作，只是将远程库的内容同步到本地，但是工作区的文件并没有更新，需要进行merge操作
 * git pull 远程库名 分支名                   相当于fetch+merge
 *
 *
 */

public class GitStudy {
}
