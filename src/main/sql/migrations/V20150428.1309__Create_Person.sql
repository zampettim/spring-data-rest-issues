-- Create the Person table.
create table person
(
  id			serial				not null,
  first_name	varchar				not null,
  last_name		varchar				not null,
  
  constraint pk_person primary key (id),
  constraint uk_person unique (first_name, last_name)
);
  