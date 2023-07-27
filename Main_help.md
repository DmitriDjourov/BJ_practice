+  git echo "# test1" >> README.md
+  git init
+  git add README.md
+  git commit -m "first commit"
+  git branch -M main
+  git remote add origin https://github.com/DmitriDjourov/Basic_Java_training.git
+  git push -u origin main
>  …or push an existing repository from the command line
+  git remote add origin https://github.com/DmitriDjourov/Basic_Java_training.git
+  git branch -M main
+  git push -u origin main



+  git branch print_r_branch
+  git checkout print_r_branch
+  git add .
+  git commit -m "dfjsdfds"
+  git push -u origin print_r_branch

+  git log
+  q

+  git checkout main
+  git merge print_r_branch
+  git log

+  git branch -d branch_name для слитой ветки 
+  git branch -D branch_name для ненужных веток


+  git push <remote_repository_name> --delete <branch_name>
>  или
+  git push <remote_repository_name> :<branch_name>

>>  В большинстве случае использования, в качестве remote_branch_name используется origin.
>> К примеру, код будет выглядеть так:
+ git push origin --delete tests    -
