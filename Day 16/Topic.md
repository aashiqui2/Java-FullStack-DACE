Create an ArrayList to store 5 student names.
- Add names to the list
- Display all names
- Find the total number of students

Create an ArrayList with student names.
- Check if "Rahul" is in the list
- Display "Found" or "Not Found"

Create an ArrayList with 5 student names.
- Remove the student at index 2
- Display the updated list

Create an ArrayList of integers: [10, 20, 30, 40, 50]
- Calculate and display the sum of all numbers
- Find the largest number

Create an ArrayList: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
- Create two new lists: one for even numbers, one for odd numbers
- Display both lists

Create an ArrayList: ["Apple", "Banana", "Cherry", "Date"]
- Display the list in reverse order
- (Hint: Use Collections.reverse() or loop backwards)

Create an ArrayList: [5, 2, 8, 2, 9, 5, 6, 8, 3]
- Use HashSet to remove duplicate numbers
- Display the unique numbers

Create two ArrayLists:
List1: [1, 2, 3, 4, 5]
List2: [4, 5, 6, 7, 8]
- Find and display common elements (4, 5)

Create a HashMap to store:
- Student Name (key) → Marks (value)
- Add 5 students with their marks
- Display all students and their marks
- Find marks of a specific student

Given a string: "hello"
- Count how many times each character appears
- Use HashMap<Character, Integer>
- Output: h=1, e=1, l=2, o=1

Create a HashMap for a phone directory:
- Name (key) → Phone Number (value)
- Add 4 contacts
- Search for a contact by name
- Update a phone number
- Delete a contact

Create an ArrayList: [45, 12, 78, 34, 89, 23]
- Sort in ascending order
- Sort in descending order
- Display both

Given sentence: "java is fun and java is powerful"
- Count how many times each word appears
- Use HashMap<String, Integer>

Create a shopping cart using ArrayList:
- Add items: "Pen", "Book", "Pencil"
- Display all items
- Check if "Book" is in cart
- Remove "Pen"
- Display final cart

Store marks of 5 subjects in an ArrayList
- Calculate average
- Display grade:
  * A: average >= 90
  * B: average >= 75
  * C: average >= 60
  * F: average < 60


Store marks of 3 students (each student has 5 subjects)
- Use ArrayList<ArrayList<Integer>> or HashMap<String, ArrayList<Integer>>
- Calculate average for EACH student
- Display grade for EACH student
- Find the student with highest average

Example:
Student 1: [85, 90, 78, 92, 88]
Student 2: [95, 98, 91, 97, 99]
Student 3: [65, 70, 68, 72, 75]

Output:
Student 1: Average = 86.6, Grade = B
Student 2: Average = 96.0, Grade = A
Student 3: Average = 70.0, Grade = C
Top Student: Student 2


Store marks of 5 students across 3 subjects (Math, Science, English)
- Use HashMap<String, HashMap<String, Integer>>
  Outer map: Student Name -> Inner Map
  Inner map: Subject -> Marks

Tasks:
1. Calculate average for each student
2. Find highest marks in each subject
3. Find which student scored highest in Math
4. Display overall topper

Example Structure:
Rahul -> {Math=85, Science=90, English=78}
Priya -> {Math=95, Science=88, English=92}

Store marks of 10 students (5 subjects each)
- Calculate average for each student
- Assign grades (A, B, C, F)
- Create a grade distribution report:
  * How many students got A?
  * How many students got B?
  * How many students got C?
  * How many students got F?
- Calculate class average
- Find percentage of students who passed (grade >= C)

Use: HashMap<String, Integer> for grade count

