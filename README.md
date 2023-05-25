## Journey in Java
Would like to dedicate this repo to recreate CompSci concepts learned on other envs, these may vary and eventually (hopefully) evolve into a solid project. For now, will recreate

 - Nodes
  - BindirectionalNodes // @ Julio 
 - Queues
    - PriorityQueue
 - LinkedLists // @ Gera xx
    - DoubleLinkedList
 - Binary Trees
    - Binary Search Tree
    - AVL Tree
 - Graphs
    - Directed Graph
    - Undirected Graph
    - Weighted Graph
    - Directed Acyclic Graph

Possible Projects:
 - Workflow Engine
 - 








## Workflow Engine
When working in bigger projects, we will often have the need to orchestrate workflow of different cases somehow. Writing different workflow in code can become really hard to maintain relatively easy. We also encounter ourselves wanting to test different workflow configurations very rapidly. We clearly need an engine we could implement to our project to help us orchestrate the various steps our service(s) may need. We need an orchestation engine, or rather a workflow engine.

Here is a (somewhat) defined roadmap of the effort needed for this, subject to change:
### Config Effort
- Define a config schema
- Parsing json config
- Validating config

### Workflow Serializating Effort
- Defining Workflow
   - Defining Steps
- Defining input/ouput mapping
   - I/O handler
- Serializing config to workflow
- Validating workflow

### Step Exec Effort
- Defining hollow Operations
- Operations ref-exec
- Accessing input/ouput mapping
   - I/O handler

### Workflow Exec Effort
- Multi-Threading Safety
- I/O thread-safe handling
- Step Scheduling 

### Multi-Workflow orchestration Effort
- Multi-Threading Safety for concurrent workflows
