insert into users (username, password, enabled)
	values('admin', '1234', true);
	
	
insert into authorities(username, authority)
	values('admin', 'ROLE_ADMIN');
	