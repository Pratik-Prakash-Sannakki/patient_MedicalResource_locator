# patient_MedicalResource_locator

This application is a platform for people to find medical resource in different city and 
community.  
Encounter represent a visit to the doctor’s office. The vital signs timeline is linked to the 
encounters. Each Encounter will have a single Vital Sign component. 

<img width="381" alt="Screenshot 2022-11-18 at 11 20 03 AM" src="https://user-images.githubusercontent.com/114252357/202752086-048255ee-595f-4e2c-87c1-e0457a9c0594.png">




Implementing  an application based on the given model with Java swing.  
o Patients are able to look for a doctor under the near hospitals 
o Doctors are able to diagnose and leave encounter record based on vital signs 
o Community admins are able to modify the information under a community 
o System admin should have all access(CRUD) to all resources in this application 


# Class Diagram




![Untitled Diagram drawio-4](https://user-images.githubusercontent.com/114252357/198906605-8b31e0fc-2ed9-4d8b-a976-c9e589f15542.png)




# Sequence diagram




![Untitled Diagram drawio-2](https://user-images.githubusercontent.com/114252357/198904006-8445f98d-b8f2-402a-a709-bba0e3484b0c.png)

# Functionality -

Steps- 

1) Login - Enter System Admin Credentials - create users - logout.
 
2) Login - Enter Community Admin Credentials - Add City,Community, House, Floor number, Apartment number 
     **To add all of the details follow the below steps**
          1) Enter values into text box 
          2) save detail 
          3) show details 
          4) select it in the table and click select selected value in the table 
          5) move on to next value to be entered follow step 1-5 again 
          6) repeat till apartment number is saved 
          7) to delete details click on show details- select it in table - click delete details 
  
3) Login - Enter Hospital Admin Credentials - show - select - follow same for city and community
    **To add all of the details follow the below steps**
          1) Add hospital - save - select hospital.
          2) show hospital - select doctor to be linked - select save details.
          3) to delete hospital - show details - select - click details. 
 
4) Login - Enter Patient credentails 
     **2 functionality**
          1) enter all patient details and register patient details
          2) create a appointment with doctor nearest to you in your city, community, hospital in the selected community

5) Login - Enter Doctor credentails
       **2 functionality**
          1) enter all doctor details and register doctor details.
          2) update the vitals of all apoints in view appointments table - select the appointment in table - enter values in    respective fields and click on "select encounter and modify details"
6) Login - enter Sysadmin credentails - view Patients, doctors and hospitals details.  



# Validation Checks

**login page** 
1) login cred - empty check.

**Sysadmin page**  
1) User Name and password - empty check

**Community Admin**
1) City , Community - empty check - alphabet val check
2) House Name - empty check - alphabet val with space check
3) House floor house Number- Number check 

**Hospital Admin**
1) Hospital - alphabet check with no space

**Patient**
1) Age - number check
2) Cellphone - 10 digit lenth check - empty check - long type check
3) email -  empty check -  valid email check

**doctor**
1) Cellphone - 10 digit lenth check - empty check -  long type check
2) Specialization and degree - empty check - - alphabet with no space check.








Note 

ID is considered as a field with combination of alphabets and Numbers so Datatype String is being used eg- NU002780000
