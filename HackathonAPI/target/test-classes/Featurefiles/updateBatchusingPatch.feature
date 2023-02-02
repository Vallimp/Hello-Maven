Feature: Batch
Scenario Outline: Update Batch using Patch
Given A Service URL with URI path is provided
When Patch request is made as parameters at Path  "<batchName>" and "<batchDescription>" are updated
Then Validate response status code at the end of the modification
And Validate  "batchiD", "batchName" and "batchDescription" after the update action

Examples:
  | batchId     | batchName             |batchDescription  |
  | 838         |Interfacestrikingteam2 | Endlessworkmode  |

 