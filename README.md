# Loan_operating_system-harshit-chaudhary
This program deals with inputting the information of a customer and the details of the loan he wants and return the EMI for the loan.

In the customer folder, class Customer inherits the methods of the classes information_customer and loan_info.

In the operation folder, the los_process class operates the sanctioning of the loan. The speciality of this class is that it inherits the data members of the interface constant_loan to find the rate of interest applicable by just entering the type of loan. This class inherits the data from the class Customer by the object cstmr. cstmr itself inherits the objects li and ic.

In the start folder, the class Application_process deals with creating objects of types information_customer and loan_info and making another object of class Customer that inherits the data members and member functions of the classes information_customer and loan_info. Then this class calls the los_process class using the object of type Customer. Basically, the program is executed by the main method of the class Application_process.

This is a centralised system. 

Demerits of centralised system are that they can’t scale up vertically after a certain limit, i.e. even if we increase the hardware and software capabilities of the server node, the performance does not change much. Also, denial of service error occurs when there is a heavy traffic on the system.

Even, there are a few benefits of centralised systems- they are easy to physically secure, have a smooth user experience, have dedicated resources, have good cost efficiency for small scale work and a node can easily be deatached from the system when required.
