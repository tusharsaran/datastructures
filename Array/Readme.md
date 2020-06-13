<h2>Array:</h2>
is a datastructure consisting of the collection of simiar data type elements each identified by array index. An array is stored
such that the position of each element can be computed from its indec cell by a mathematical formulae. What that means is that
if you have an array then u can find the number in array from the first index.

<br><br>
<b>e.g. of Array :</b> Array of Integer with size 9 
<table>
  <tr>
    <td>
           12
    </td>
     <td>
           2
    </td>
     <td>
           5
    </td>  
    <td>
           67
    </td>
    <td>
          452
    </td>
     <td>
           95
    </td>   
    <td>
           56
    </td>
    <td>
           7
    </td>
     <td>
           36
    </td>    
  </tr>
</table>


<br><br>
<b>e.g. of Array :</b> Array of char with size 5
<table>
  <tr>
    <td>
           'g'
    </td>
     <td>
           'q'
    </td>
     <td>
           'y'
    </td>  
    <td>
           'p'
    </td>
    <td>
          'd'
    </td>
  </tr>
</table>

<br><br>
<b>Properties of an array :</b>
  - every cell of an array has a unique index
  - index starts with 0
  - array can store data of specified data type i.e. if its an integer array one cannot store char or String or 
  any other data type.
  - It has contiguous memory location
  - Size of an array needs to be mandatorily specified and cannot be modified. Once you are creating an array u have to define
  the size of an array. Once the array is created u cannot increase or decrease the size if of an array.Thats one of the 
  limitaion of an array.
  
  
   <h2> Why do we need an Aray </h2>
  <p>Lets say we have a problem where we have to store 1 million records of same data type. So one solution is to created 1     
  million records or variables with the same data type. 
  Now what is the problem with above solution : it will be really hard to maintain it.also we need to remember the name of all 
  million records.</p>
  <p>So Array come in picture where we can store data with the same data type and it is in maintaining and retriving or 
  computing on any given records. </p>
  
  <b>Types of Array : </b>
  - One dimensionsal : is the one which has one row and has multiple columns.
  - Multidimensional array : is the one which has `more than one rows or multiple rows` and multiple columns.
    Multidimesional array can be :
      - two dimensional array
      - three dimensional array
      - four dimensional array
      - n dimensional array
    </p>(Java supports upto 255 dimensional array). </p>
    <p>In java we mainly use more one and two dimensional arrays.</p>
    
    
<br>
<b>e.g. of One dimensional Array :</b> 
<table>
  <tr>
    <td>
           12
    </td>
     <td>
           2
    </td>
     <td>
           5
    </td>  
    <td>
           67
    </td>
    <td>
          452
    </td>
     <td>
           95
    </td>   
    <td>
           56
    </td>
    <td>
           7
    </td>
     <td>
           36
    </td>    
  </tr>
</table>


<br>
<b>e.g. of Multidimensional dimensional Array(two dimensional array) :</b> 
<table>
  <tr>
    <td>
           12
    </td>
     <td>
           2
    </td>
     <td>
           5
    </td>  
    <td>
           67
    </td>
    <td>
          452
    </td>
     <td>
           5
    </td>   
    <td>
           46
    </td>
    <td>
           27
    </td>
     <td>
           9
    </td>    
  </tr>
  <tr>
    <td>
           26
    </td>
     <td>
           45
    </td>
     <td>
           84
    </td>  
    <td>
           56
    </td>
    <td>
          75
    </td>
     <td>
           976
    </td>   
    <td>
           65
    </td>
    <td>
           24
    </td>
     <td>
           624
    </td>    
  </tr>
   <tr>
    <td>
           351
    </td>
     <td>
           53
    </td>
     <td>
           451
    </td>  
    <td>
           246
    </td>
    <td>
          1
    </td>
     <td>
           95
    </td>   
    <td>
           4125
    </td>
    <td>
           254
    </td>
     <td>
           543
    </td>    
  </tr>
</table>


