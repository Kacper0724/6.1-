insert into POSTS (USER_ID, BODY)
values (1, 'This is post to delete');

commit;

select * from POSTS;

update POSTS
set BODY = 'To delete'
where ID = 7;

commit;

delete from POSTS
where ID =  7;

commit;