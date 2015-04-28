-- Load some data.

insert into person (id, first_name, last_name)
  values (1, 'First 1', 'Last 1'),
         (2, 'First 2', 'Last 2'),
         (3, 'First 3', 'Last 3');
  
insert into address (person_id, number, street1, city, state, country, zipcode)
  values (1, '1', 'Street 1', 'City 1', 'State 1', 'USA', '12345'),
         (1, '2', 'Street 2', 'City 2', 'State 2', 'USA', '12345'),
         (2, '3', 'Street 3', 'City 3', 'State 3', 'USA', '23456'),
         (3, '4', 'Street 4', 'City 4', 'State 4', 'USA', '34567');
         
insert into bookmarks (person_id, name, url, description)
  values (1, 'bmark1', 'http://link.to.something/1', 'Useful Link 1'),
         (2, 'bmark2', 'http://link.to.something/2', 'Useful Link 2'),
         (2, 'bmark3', 'http://link.to.something/3', 'Useful Link 3'),
         (3, 'bmark4', 'http://link.to.something/4', 'Useful Link 4');