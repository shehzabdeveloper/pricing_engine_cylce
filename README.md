# pricing_engine_cylce
The module to be developed is a pricing engine for a cycle.
A cycle can be thought of as high level components -
1. frame
2. handle bar with brakes
3. seating
4. wheels
5. chain assembly

Each of the above high level components will have parts, for instance, a wheel has spokes, rim, tube, tyre.  The pricing module should be able to calculate the price of the cycle given its configuration. For example, price a cycle with tubeless tyres, steel frame, 4 gears. The pricing of the parts is time sensitive, means the cost of a tyre will change with time and the module should support this. A tyre can cost 200Rs from Jan 2016 - Nov 2016, and its price can change to Rs 230 from Dec 2016 onwards.

The pricing module should be a command line executable, no graphical ui needed. It can take its input as command line parameters or as a json text file, whatever is convenient to specify in. The inputs to the module will be the list of constituent parts, date of pricing and it will output the price of the entire cycle and also price for each high level component - frame, wheels etc.  Modular code and well thought out class/object model is expected as well as Junit tests for main classes.

### Calculate Pricing for 1000 cycles using multithread and blocking queue using a maximum of 10 threads.
