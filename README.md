# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String class** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

<img width="301" height="453" alt="image" src="https://github.com/user-attachments/assets/4ee84afc-81c1-4a86-b14b-a8b261558f85" />


## Video

<img width="306" height="413" alt="image" src="https://github.com/user-attachments/assets/fcc4d57c-f62d-459e-84a0-f53d3b3ee927" />

https://youtube.com/shorts/_iDLx6znsh0

## Project Description

The goal of my NLP is to quickly check/edit grammar in a sentence such as missing punctuation, editing punctuation, and fixing double space errors. The text that's being analyzed is a sentence that can either be added to the NLP to be reviewed or directly added by the user by using the scanner. The user is able to see previously added sentences or add a new sentence when they start the NLP up, if they choose to add a sentence, they will be prompted to add their sentence and then the NLP will analyze their sentence and display the corrected result.

## NLP Techniques

My project uses a "text normalization" NLP. Text normalization is used to clean up text and make it easier to read. 

method - fixDoubleSpace takes in a sentence and checks for double spaces in that sentence, effectively changing any spaces more than 1 to 1.

method - fixPeriod checks if a sentence is missing it's ending punctuation such as a period, exclamation mark, or question mark. If missing, it adds a period to the end of the sentence.

method - changeEndingPunctuation allows the user to change the ending punctuation if desired, or keep it as what it is. For example the user can change a period to an exclamation mark or question mark, or just keep it depending on what they want.

These methods are necessary to the NLP technique because the methods work very well together to clean up text and make the text more standardized, which is essential for a text normalizing NLP. The methods are also essential to help the other methods function because the fixDoubleSpace first cleans up the unwanted spacing and makes the sentence more compact, then the fixPeriod method makes sure there is an ending punctuation for the changeEndingPunctuation to change. Without these 3 methods, the NLP would not work because they all work in synergy to deliver effective sentence clean up.




