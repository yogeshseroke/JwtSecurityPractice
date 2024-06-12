Step (1) :- 

method :- POST
url :- http://localhost:9595/auth/login

request body :-
{
  "email": "DURGESH",
  "password": "DURGESH"
}

response body :- 
{
    "jwtToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJEVVJHRVNIIiwiaWF0IjoxNzE4MTg4ODczLCJleHAiOjE3MTgyMDY4NzN9.Yy50oFQo4ZIwQbUUwb2oMyQhOOa8YBuUsMYgGy037pClq5YqL1i1q6oJkCbySq3DlWGov3CokOWGbx5L8AB13w",
    "status": null,
    "username": "DURGESH",
    "statusCode": 0,
    "data": null
}
 
-------------------------------------------------------------------------------------------------

Step (2) :- 

method :- GET
url :- http://localhost:9595/test

key :- Authorization 
header :- Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJEVVJHRVNIIiwiaWF0IjoxNzE4MTg3OTk1LCJleHAiOjE3MTgyMDU5OTV9.EnJ4vxMMglLKacXuAV1Wekszqv1FBOGZGDanejbZ9Xv58Ov3bUgzqma8hfUdHppxD_WdYvxEpDLINUa00p9Q3A

response body :- Testing message
