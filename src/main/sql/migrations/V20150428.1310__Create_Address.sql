-- Create the Address table.
create table address
(
	id			serial				not null,
	person_id	int					not null,
	number		varchar				not null,
	street1		varchar				not null,
	street2		varchar					null,
	city		varchar				not null,
	state		varchar				not null,
	country		varchar				not null,
	zipcode		varchar				not null,
	
	constraint pk_address primary key (id),
	constraint fk_person_address_person_id
	  foreign key (person_id) references person(id)
);