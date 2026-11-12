Chains and Runnables in LangChain
Chains and Runnables are two important concepts in modern LangChain. If you understand these concepts, you can build complex LLM applications using LCEL.

Let's understand them step by step using your Ollama model qwen3.5:2b.

1. What is a Chain?

    A Chain is a sequence of components connected together to perform a particular task.

    For example, suppose you want to build an application that explains programming topics.

    The application needs to:

        Accept a topic from the user.
        Create a prompt.
        Send the prompt to an LLM.
        Parse the response.
        Return the final answer.

    Instead of executing each component separately, you connect them into one chain.

    User Input
    Python
    PromptTemplate
    OllamaLLM
    StrOutputParser
    Final Response

2. What is a Runnable?
    A Runnable is a common interface in LangChain that allows different components to work together.

    In simple words:

    A Runnable is an object that can receive input, perform an operation, and return output.

    Many LangChain components implement the Runnable interface.

    Examples:

    Component
    Purpose
    PromptTemplate
    Creates prompts

    OllamaLLM
    Generates responses

    StrOutputParser
    Parses output

    RunnableLambda
    Executes custom Python functions

    RunnableParallel
    Executes multiple operations in parallel

    RunnablePassthrough
    Passes input without changing it

    Most importantly, Runnables support methods such as:
    invoke() – Execute one input.

    batch() – Execute multiple inputs.

    stream() – Stream output.

    ainvoke() – Execute asynchronously.

    astream() – Stream asynchronously.

3. Your first Runnable chain
Let's create a simple chain.


python
from langchain_ollama import OllamaLLM
from langchain_core.prompts import PromptTemplate
from langchain_core.output_parsers import StrOutputParser

llm = OllamaLLM(model="qwen3.5:2b")

prompt = PromptTemplate(
    input_variables=["topic"],
    template="Explain {topic} in simple language."
)

parser = StrOutputParser()

chain = prompt | llm | parser

response = chain.invoke({
    "topic": "Machine Learning"
})

print(response)
Here:


python
chain = prompt | llm | parser
Creates a RunnableSequence.

Each component passes its output to the next component.

4. Important Runnable types
These are particularly important in LangChain 1.x.

A. RunnableSequence
RunnableSequence executes multiple Runnables sequentially.

Example:


python
from langchain_core.runnables import RunnableSequence

chain = RunnableSequence(
    prompt,
    llm,
    parser
)

response = chain.invoke({
    "topic": "Artificial Intelligence"
})

print(response)
You can also write the same thing using LCEL:


python
chain = prompt | llm | parser
This is the shorter and more common approach.

B. RunnableParallel
RunnableParallel executes multiple Runnables using the same input, returning their outputs in a dictionary.

Suppose you want to generate:

A short explanation.

A detailed explanation.

Advantages.

All three tasks can run in parallel.

Input: Python

Runnable 1

Short explanation

Runnable 2

Detailed explanation

Runnable 3

Advantages

Combined dictionary output

Code:


python
from langchain_core.runnables import RunnableParallel

short_prompt = PromptTemplate.from_template(
    "Explain {topic} in 2 sentences."
)

detail_prompt = PromptTemplate.from_template(
    "Explain {topic} in detail."
)

advantage_prompt = PromptTemplate.from_template(
    "Give 5 advantages of {topic}."
)

parallel_chain = RunnableParallel(
    short=short_prompt | llm | parser,
    detailed=detail_prompt | llm | parser,
    advantages=advantage_prompt | llm | parser
)

response = parallel_chain.invoke({
    "topic": "Python"
})

print(response["short"])
print(response["detailed"])
print(response["advantages"])
Note: The three branches are scheduled in parallel, but they share the same Ollama model instance. Actual generation speed depends on Ollama's model scheduling and hardware.

C. RunnablePassthrough
This Runnable passes input without modifying it.

Example:


python
from langchain_core.runnables import RunnablePassthrough

chain = RunnablePassthrough()

response = chain.invoke({
    "name": "Rahul",
    "age": 25
})

print(response)
Output:


python
{
    "name": "Rahul",
    "age": 25
}
Why is this useful?

Sometimes you want to preserve the original input while another Runnable processes it.

Example:


python
chain = RunnableParallel(
    original=RunnablePassthrough(),
    explanation=prompt | llm | parser
)

response = chain.invoke({
    "topic": "LangChain"
})

print(response["original"])
print(response["explanation"])
Now you get both the original input and the generated explanation.

D. RunnableLambda
This Runnable allows you to execute your own Python functions inside an LCEL chain.

For example, suppose you want to convert generated text into uppercase.


python
from langchain_core.runnables import RunnableLambda

def uppercase(text):
    return text.upper()

uppercase_runnable = RunnableLambda(uppercase)

chain = prompt | llm | parser | uppercase_runnable

response = chain.invoke({
    "topic": "Python"
})

print(response)
You can use any suitable Python function inside RunnableLambda.

E. RunnableBranch
RunnableBranch allows conditional execution.

For example:

If the topic is Python, execute a Python-related prompt.

Otherwise, execute a general programming prompt.


python
from langchain_core.runnables import RunnableBranch

python_chain = (
    PromptTemplate.from_template(
        "Explain Python: {topic}"
    )
    | llm
    | parser
)

general_chain = (
    PromptTemplate.from_template(
        "Explain this programming topic: {topic}"
    )
    | llm
    | parser
)

branch = RunnableBranch(
    (
        lambda x: x["topic"].lower() == "python",
        python_chain
    ),
    general_chain
)

response = branch.invoke({
    "topic": "Python"
})

print(response)
5. Difference between Chains and Runnables
Chains

Runnables

Represent workflows

Common execution interface

Can combine components

Can represent individual components or workflows

Older chains often use specialized classes

Modern components generally implement Runnable

Examples: LLMChain (legacy)

RunnableSequence, RunnableParallel

An important distinction: a chain is a workflow concept, whereas Runnable is the interface that makes components composable. In modern LangChain, chains are commonly built from Runnables.

6. Important Runnable methods
Method

Explanation

invoke()

Single input execution

batch()

Multiple input execution

stream()

Incremental output

ainvoke()

Async single execution

abatch()

Async batch execution

astream()

Async streaming

Example of batch:


python
topics = [
    {"topic": "Python"},
    {"topic": "Java"},
    {"topic": "C++"}
]

responses = chain.batch(topics)

for response in responses:
    print(response)
Example of streaming:


python
for chunk in chain.stream({
    "topic": "LangChain"
}):
    print(chunk, end="", flush=True)
7. Practice project: Build a multi-task AI application
Let's combine what you have learned.

Goal: Enter a topic and generate three outputs:

Definition.

Advantages.

Real-world applications.

Use RunnableParallel.


python
from langchain_ollama import OllamaLLM
from langchain_core.prompts import PromptTemplate
from langchain_core.output_parsers import StrOutputParser
from langchain_core.runnables import RunnableParallel

llm = OllamaLLM(
    model="qwen3.5:2b",
    temperature=0.1
)

parser = StrOutputParser()

definition = (
    PromptTemplate.from_template(
        "Define {topic}."
    )
    | llm
    | parser
)

advantages = (
    PromptTemplate.from_template(
        "Explain 5 advantages of {topic}."
    )
    | llm
    | parser
)

applications = (
    PromptTemplate.from_template(
        "Give 5 real-world applications of {topic}."
    )
    | llm
    | parser
)

chain = RunnableParallel(
    definition=definition,
    advantages=advantages,
    applications=applications
)

result = chain.invoke({
    "topic": "Artificial Intelligence"
})

print("DEFINITION:")
print(result["definition"])

print("\nADVANTAGES:")
print(result["advantages"])

print("\nAPPLICATIONS:")
print(result["applications"])
8. Your learning roadmap
LangChain learning path
LLM and Chat Models

Foundation
Prompt Templates

Foundation
LCEL and Output Parsers

Foundation
Chains and Runnables

Current topic
Message History and Memory patterns

Document Loaders and Text Splitters

Embeddings and Vector Databases

Retrieval and RAG

Agents and Tools

9. Test your understanding
Runnable quiz

0/4 answered
1. Which Runnable executes multiple operations using the same input?


RunnableLambda

RunnableParallel

RunnablePassthrough

2. Which Runnable executes a custom Python function?


RunnableLambda

RunnableSequence

RunnableBranch

3. What does RunnablePassthrough do?


Converts text to JSON

Passes input unchanged

Executes branches conditionally

4. Which Runnable supports conditional routing?


RunnableParallel

RunnablePassthrough

RunnableBranch