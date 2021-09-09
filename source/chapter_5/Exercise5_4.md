## Exercise 5.4
Using the following variables, evaluate the logic expressions in
the table that follows. Write your answers as true, false, or error.

<span style="color:blue">boolean</span> yes = true; <br>
<span style="color:blue">boolean</span> no = false; <br>
<span style="color:blue">int</span> loVal = -999; <br>
<span style="color:blue">int</span> hiVal = 999; <br>
<span style="color:blue">double</span> grade = 87.5; <br>
<span style="color:blue">double</span> amount = 50.0; <br>
String hello = <span style="color:red">"world"</span>; <br>


| Expression                         | Result |
|------------------------------------|--------|
| yes == no \|\| grade > amount      | true   |
| amount == 40.0 \|\| 50.0           | error  |
| hiVal != loVal \|\| loVal < 0      | true   |
| True \|\| hello.length() > 0       | error  |
| hello.isEmpty() && yes             | false  |
| grade <= 100 && !false             | true   |
| !yes \|\| no                       | false  |
| grade > 75 > amount                | error  |
| amount <= hiVal && amount >= loVal | true   |
| no && !no \|\| yes && !yes         | false  |
