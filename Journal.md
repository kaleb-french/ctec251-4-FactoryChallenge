# Journal
Write your Journal questions and notes here.

Phase 1-
Creating the factory creates a layer of abstractions Main doesn't need to know what enemys there are, and enemys don't need to be called directly for creation in Main. 
This allows a simple method with arg call to create new enemies in main, the factory just needs another line in the switch to accomodate new enemies. 
This in a game could allow categories for spawning or spawn enemies base on what level it is with the main not knowing what enemies are existing just gets one on return of the method.

Phase 2-
when using inheritance to create these factory method classes, you are merely creating a new class under the same base class. This allows much of the code and calls to be very interchangeable and can be used in methods polymorphically where a EnemySpawner is needed.
If you have a method that needs a spawner passed in you can still create new subclasses from the EnemySpawner base and they will work just fine. When I switched from the SimpleFactory to the FactoryMEthod style pattern only thing I had to change for goblin and skeleton with which instance they needed to be called from.
