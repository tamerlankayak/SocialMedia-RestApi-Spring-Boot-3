insert into user_details(id, birth_date, name)
values (10001, current_date(), 'Tamerlan');

insert into user_details(id, birth_date, name)
values (10002, current_date(), 'Ariz');

insert into user_details(id, birth_date, name)
values (10003, current_date(), 'John');

insert into post(id,description,user_id)
values(20001,'I want to learn Android Development',10001);


insert into post(id,description,user_id)
values(20002,'I want to learn Docker',10002);


insert into post(id,description,user_id)
values(20003,'I want to learn Javascript',10003);

insert into post(id,description,user_id)
values(20004,'Clean code architecture',10001);