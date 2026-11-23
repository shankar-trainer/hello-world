You can use Generative AI + LangChain + Vision LLM to read images, understand their contents, extract information, and generate structured data in JSON format.

For example, you can upload an invoice image, and GenAI can extract:

- Invoice number
- Customer name
- Invoice date
- Product details
- Quantity
- Price
- Total amount

Here is a complete Python example using LangChain and OpenAI Vision.

## 1. Architecture

Input Image

Invoice / Document / ID Card / Table

LangChain

Image processing and prompt management

Vision LLM (GPT-4o)

Image understanding and data extraction

Structured JSON Output

Validated data using Pydantic

## 2. Install required libraries

bash

```bash
pip install langchain langchain-openai pydantic
```

Set your API key:

bash

```bash
export OPENAI_API_KEY="your-api-key"
```

## 3. Python example: Read image and generate JSON

Suppose you have an invoice image named `invoice.jpg`.

Invoice Receipt Template in Word - Download | Template.net

[template.net](<https://www.template.net/editable/161656/invoice-receipt-template?utm_source=chatgpt.com>)

Use LangChain's `ChatOpenAI` with structured output.

python

```python

import base64
from typing import List, Optional
from pydantic import BaseModel, Field

from langchain_openai import ChatOpenAI


# 1. Define expected output structure
class InvoiceItem(BaseModel):
    product_name: str
    quantity: Optional[float] = None
    unit_price: Optional[float] = None
    total_price: Optional[float] = None


class InvoiceData(BaseModel):
    invoice_number: Optional[str] = None
    customer_name: Optional[str] = None
    invoice_date: Optional[str] = None
    items: List[InvoiceItem] = Field(default_factory=list)
    grand_total: Optional[float] = None
    currency: Optional[str] = None


# 2. Initialize Vision LLM
llm = ChatOpenAI(
    model="gpt-4o",
    temperature=0
)

# 3. Enable structured output
structured_llm = llm.with_structured_output(
    InvoiceData
)


# 4. Read image and convert to Base64
def encode_image(image_path):
    with open(image_path, "rb") as image_file:
        return base64.b64encode(
            image_file.read()
        ).decode("utf-8")


image_data = encode_image("invoice.jpg")


# 5. Send image to GenAI
result = structured_llm.invoke([
    {
        "role": "system",
        "content": """
        You are an invoice data extraction assistant.
        Read the invoice image and extract the information.
        Do not guess missing values.
        Return null for unavailable fields.
        """
    },
    {
        "role": "user",
        "content": [
            {
                "type": "text",
                "text": "Extract all invoice information."
            },
            {
                "type": "image_url",
                "image_url": {
                    "url": f"data:image/jpeg;base64,{image_data}"
                }
            }
        ]
    }
])


# 6. Display generated data
print(result.model_dump_json(indent=4))
```

## 4. Example generated JSON

The output will look something like this (illustrative):

json

```json
{
    "invoice_number": "INV-1001",
    "customer_name": "ABC Technologies",
    "invoice_date": "2026-11-20",
    "items": [
        {
            "product_name": "Laptop",
            "quantity": 2,
            "unit_price": 50000,
            "total_price": 100000
        },
        {
            "product_name": "Mouse",
            "quantity": 5,
            "unit_price": 500,
            "total_price": 2500
        }
    ],
    "grand_total": 102500,
    "currency": "INR"
}
```

## 5. Other use cases

The same approach can be used for different types of images.

Nieznane rękopisy | Gazeta Uniwersytecka UŚ

Handwritten notes

Convert handwriting into structured text.

Blank business cards

Business cards

Extract name, phone, email and company.

Person holding a printed spreadsheet with data values

Tables

Convert image tables into JSON or CSV.

Lagerorganisation mit Barcode-Etiketten: Regale kennzeichnen | Barcodeetiketten.com

Product images

Identify visible product attributes.

## 6. Next step: Build an image-to-database application

You can extend this architecture:

1. Upload image using FastAPI or Streamlit.
2. Pass image to LangChain.
3. Extract information using a Vision LLM.
4. Validate output using Pydantic.
5. Convert extracted data into JSON.
6. Store results in MySQL, PostgreSQL, or MongoDB.

One important point: LangChain handles orchestration, while the Vision LLM actually understands the image.

Would you like me to demonstrate a complete Streamlit + LangChain application where users upload any image and automatically get structured JSON data?