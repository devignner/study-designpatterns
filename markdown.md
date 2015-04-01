#디스크 추가 과정
---
(진하게 표시된 명령어를 입력하여 추가하시면 됩니다.)

1. 마운트 확인

`df -h`
이 명령어를 사용하여 disk attach 시킨 disk가 현재 VM에 추가되어 있지 않다는 것을 확인할 수 있습니다.

```
root@1asdfkjasddfkllad-asdladsa:~# df -h
Filesystem    Size Used Avail Use% Mounted on
/de/xvda1     19G   1.1G  17G   6%  /
```
