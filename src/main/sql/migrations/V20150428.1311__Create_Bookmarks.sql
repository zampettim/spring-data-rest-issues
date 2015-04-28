-- Create the bookmarks table.
create table bookmarks
(
	id			serial				not null,
	person_id	int					not null,
	name		varchar				not null,
	url			varchar				not null,
	description	varchar				not null,
	
	constraint pk_bookmarks primary key (id),
	constraint uk_bookmarks unique (person_id, name),
	constraint fk_person_bookmarks_person_id
	  foreign key (person_id) references person(id)
);