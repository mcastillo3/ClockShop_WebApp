Projects Notes to be added here.
Edited the Title in mainscreen.html, line 14.
Edited the h1 in mainscreen.html under the div, class container, line 19.
Created an about.html file with a link to return home.
Added a link to the about.html file to display at the bottom of mainscreen.html page.
Added sample inventory "products" and "parts" to the BootStrapData file. The inventory only adds if the list is empty.
Added a "buy now" button to mainscreen.html, line 85.
Added a "buyProductNow" method to AddProductController file, lines 130 - 141.
Created a confirmationbuynow.html file to display a message of a successful buy.
Created a negativeproducterror.html file to display a message of an unsuccessful buy when a product has 0 inventory.
Added intMin and intMax variables to Part.java entity on lines 32 - 36.
Created getters and setters for these variables in Part.java entity on lines 66 - 80.
Edited the sample inventory in BootStrapData component to include min and max inventory, lines 82 - 122.
Added input fields to the InhousePartForm.html and OutsourcePartForm.html for minimum and maximum inventory.
Corrected the Part constructor by initializing an inv variable in the Part entity, line 62.
Added a Range validator to the int variable in Part entity, line 31.
Added MIN and MAX validators to the min and max variables in Part entity, lines 34 and 36.
Created two TEST methods in PartTest class in the test package, lines 160 - 176.
Ran both tests and verified that both passed with no issues.
Deleted "DeletePartValidator" because it has no usage.