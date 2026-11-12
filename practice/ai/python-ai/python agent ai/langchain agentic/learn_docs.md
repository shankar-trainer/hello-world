https://docs.langchain.com/oss/python/learn

> ## Documentation Index
> Fetch the complete documentation index at: https://docs.langchain.com/llms.txt
> Use this file to discover all available pages before exploring further.

# Learn

> Tutorials, conceptual guides, and resources to help you get started.

In the **Learn** section of the documentation, you will find a collection of tutorials, conceptual overviews, and additional resources to help you build powerful applications with Managed Deep Agents, Deep Agents, LangChain, and LangGraph.

## Tutorials

Below are tutorials for common use cases, organized by framework.

### Managed Deep Agents

[Managed Deep Agents](https://docs.langchain.com/langsmith/python/managed-deep-agents-overview.md) is the recommended way to build and deploy deep agents. You write the agent; LangSmith runs the harness and runtime.

> [card] [Deep research](https://docs.langchain.com/oss/python/deepagents/deep-research.md)
>
> Build a multi-step web research agent with Managed Deep Agents or the Deep Agents SDK.

> [card] [Content builder](https://docs.langchain.com/oss/python/deepagents/content-builder.md)
>
> Build a content writing agent with brand voice, skills, and image tools using Managed Deep Agents or the Deep Agents SDK.

### Deep Agents

For maximum flexibility while using the same Deep Agents harness as [Managed Deep Agents](#managed-deep-agents), use the Deep Agents SDK and host agents yourself, or run a custom [LangSmith Deployment](https://docs.langchain.com/langsmith/deployment.md).

> [card] [Deep research](https://docs.langchain.com/oss/python/deepagents/deep-research.md)
>
> Build a multi-step web research agent with Managed Deep Agents or the Deep Agents SDK.

> [card] [Content builder](https://docs.langchain.com/oss/python/deepagents/content-builder.md)
>
> Build a content writing agent with brand voice, skills, and image tools using Managed Deep Agents or the Deep Agents SDK.

> [card] [Data analysis](https://docs.langchain.com/oss/python/deepagents/data-analysis.md)
>
> Build a data analysis agent that sends reports to Slack with the Deep Agents SDK.

### LangChain

[LangChain](https://docs.langchain.com/oss/python/langchain/overview.md) [agent](https://docs.langchain.com/oss/python/langchain/agents.md) implementations make it easy to get started for simple use cases.

> [card] [Semantic Search](https://docs.langchain.com/oss/python/langchain/knowledge-base.md)
>
> Build a semantic search engine over a PDF with LangChain components.

> [card] [RAG Agent](https://docs.langchain.com/oss/python/deepagents/rag.md)
>
> Create a Retrieval Augmented Generation (RAG) agent.

> [card] [SQL Agent](https://docs.langchain.com/oss/python/langchain/sql-agent.md)
>
> Build a SQL agent to interact with databases with human-in-the-loop review.

> [card] [Voice Agent](https://docs.langchain.com/oss/python/langchain/voice-agent.md)
>
> Build an agent you can speak and listen to.

### LangGraph

LangChain's [agent](https://docs.langchain.com/oss/python/langchain/agents.md) implementations use [LangGraph](https://docs.langchain.com/oss/python/langgraph/overview.md) primitives.
If deeper customization is required, agents can be implemented directly in LangGraph.

> [card] [Custom RAG Agent](https://docs.langchain.com/oss/python/langgraph/agentic-rag.md)
>
> Build a RAG agent using LangGraph primitives for fine-grained control.

> [card] [Custom SQL Agent](https://docs.langchain.com/oss/python/langgraph/sql-agent.md)
>
> Implement a SQL agent directly in LangGraph for maximum flexibility.

### Multi-agent

These tutorials demonstrate [multi-agent patterns](https://docs.langchain.com/oss/python/langchain/multi-agent.md), blending LangChain agents with LangGraph workflows.

> [card] [Subagents: Personal assistant](https://docs.langchain.com/oss/python/langchain/multi-agent/subagents-personal-assistant.md)
>
> Build a personal assistant that delegates to sub-agents.

> [card] [Handoffs: Customer support](https://docs.langchain.com/oss/python/langchain/multi-agent/handoffs-customer-support.md)
>
> Build a customer support workflow where a single agent transitions between different states.

> [card] [Router: Knowledge base](https://docs.langchain.com/oss/python/langchain/multi-agent/router-knowledge-base.md)
>
> Build a multi-source knowledge base that routes queries to specialized agents.

> [card] [Skills: SQL assistant](https://docs.langchain.com/oss/python/langchain/multi-agent/skills-sql-assistant.md)
>
> Build an agent that loads specialized skills progressively using on-demand context loading.

## Conceptual overviews

These guides explain the core concepts and APIs underlying LangChain and LangGraph.

> [card] [Memory](https://docs.langchain.com/oss/python/concepts/memory.md)
>
> Understand persistence of interactions within and across threads.

> [card] [Context engineering](https://docs.langchain.com/oss/python/concepts/context.md)
>
> Learn methods for providing AI applications the right information and tools to accomplish a task.

> [card] [Graph API](https://docs.langchain.com/oss/python/langgraph/graph-api.md)
>
> Explore LangGraph’s declarative graph-building API.

> [card] [Functional API](https://docs.langchain.com/oss/python/langgraph/functional-api.md)
>
> Wrap an agent from another framework for LangSmith Deployment.

## Additional resources

> [card] [LangChain Academy](https://academy.langchain.com/)
>
> Courses and exercises to level up your LangChain skills.

> [card] [Case Studies](https://docs.langchain.com/oss/python/langgraph/case-studies.md)
>
> See how teams are using LangChain and LangGraph in production.

***

[Connect these docs](https://docs.langchain.com/use-these-docs.md) to your agent of choice via MCP for real-time answers.

[Edit this page on GitHub](https://github.com/langchain-ai/docs/edit/main/src/oss/learn.mdx) or [file an issue](https://github.com/langchain-ai/docs/issues/new/choose).
