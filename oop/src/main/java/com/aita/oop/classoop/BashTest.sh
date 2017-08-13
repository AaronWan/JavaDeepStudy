#!/usr/bin/env bash

hosts=("172.17.21.16" "172.17.21.15" "172.17.21.14")
base_dir=~/Desktop
date="2017-08-10"
for host in ${hosts[*]}
do

scp $host:/opt/fs/fs-bpm/logs/error.2017-08-10.log.zip $base_dir/error.$host.zip

unzip $base_dir/error.$host.zip
cat $base_dir/error.$date.log
#cat $base_dir/error.$date.log>>$base_dir/error.$date.all.log
#
rm $base_dir/error.$date.log;
#
#rm $base_dir/error.$host.zip
#
#grep ERROR  $base_dir/error.$date.all.log|awk '/uid/{print $1,$8 }'|sed -e 's/uid.*,//' -e 's/:/ /gp' -n|awk '{print $1":"$2,$4$5}'|sort|uniq -c

done

