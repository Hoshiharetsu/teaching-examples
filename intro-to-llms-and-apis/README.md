# Introduction to LLMs and APIs (Python Teaching Example)

## Overview
This folder contains instructional Python examples used to introduce students to application programming interfaces (APIs), local large language model (LLM) workflows, and basic prompt-based interaction.

These examples are designed for an introductory programming course and provide a beginner-friendly way to discuss how modern AI tools can be accessed through Python.

---

## Teaching Focus

This example set helps students understand:

- What an API is
- How Python can send requests to an external service
- Why API keys must be protected
- How local LLM tools such as Ollama differ from hosted API-based models
- How prompt wording affects model output
- How model choice can change responses

---

## Files Included

### `groq_story_example.py`
Demonstrates how to connect to a hosted model API using the Groq Python client. Introduces:
- environment variables for API keys
- chat message structure
- parameters such as `max_tokens` and `temperature`

### `ollama_model_comparison.py`
Shows how to query two different local models using Ollama and compare their responses to the same question.

### `ollama_setup_and_prompt.py`
Walks through the basic setup and testing process for Ollama, including:
- confirming the Python package is installed
- checking whether models are available
- prompting the user for input
- displaying model output

---

## Why This Matters

These examples give students an accessible introduction to how AI tools are used in Python without requiring a deep machine learning background.

They also provide an opportunity to discuss practical topics such as:
- secure handling of API keys
- local vs hosted tools
- model differences
- prompt design

---

## Instructional Approach

The examples are intentionally simple and are used as walkthroughs rather than production applications. The goal is to help students connect familiar Python concepts—variables, functions, user input, and libraries—to newer tools such as APIs and LLM interfaces.

---

## What Students Practice

- Importing and using third-party Python libraries
- Writing and testing prompt-based programs
- Comparing outputs from different models
- Understanding the role of configuration in API and local model workflows
- Discussing responsible handling of credentials

---

## Future Extensions

- Add a version that compares prompt phrasing
- Add basic error handling examples
- Add a simple GUI front end for beginner interaction
- Compare hosted and local model workflows in more detail

---

## Summary

This example set introduces students to APIs and LLMs through approachable Python exercises. It emphasizes practical usage, responsible setup, and conceptual understanding rather than advanced machine learning implementation.
