select * from  "Customer";

select concat("FirstName",' ',"LastName") as full_name,"CustomerId", "Country"  from "Customer"
where "Country" !='USA';

select *
from "Customer" c 
where "Country" ='Brazil';

select concat("FirstName",' ',"LastName") as full_name, "InvoiceId" , "InvoiceDate" 
from "Invoice" i 
full outer join "Customer" c 
on i."CustomerId" =c."CustomerId"
where "BillingCountry" = 'Brazil' 

select *
from "Employee" 
where "Title" = 'Sales Support Agent'

select distinct  "BillingCountry" 
from "Invoice" i 

select i."InvoiceId", concat(e."LastName" ,' ', e."LastName") as full_name, c."SupportRepId" , e."Title" 
from "Customer" c
full outer join "Invoice" i on c."CustomerId" =i."CustomerId"
full outer join  "Employee" e ON c."SupportRepId" = e."EmployeeId" 
where e."Title" ='Sales Support Agent'

select i."Total" , concat(c."LastName" ,' ', c."LastName") as Customer,concat(e."LastName" ,' ', e."LastName") as Sales_agent
from "Customer" c
full outer join "Invoice" i on c."CustomerId" =i."CustomerId"
full outer join  "Employee" e ON c."SupportRepId" = e."EmployeeId" 
where e."Title" ='Sales Support Agent'

select sum("Total"),min(date_part('year',"InvoiceDate")) as years
from "Invoice" i 
--where (select avg(date_part('year', "InvoiceDate") ) <20 )
group by date_part('year',"InvoiceDate") --between 2009 and 2011
--where year between '2009' and '2011'
--having years 2011
--when year between 2009 and 2011
having date_part('year',"InvoiceDate") < 2012

select 
count(*)
from "Invoice" i 
where "InvoiceId" =37

select 
count(*)
from "Invoice" i 





