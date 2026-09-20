Linear Regression is one of the most popular and foundational algorithms in **Scikit-learn**. It is used to predict a continuous numerical value (like a price, temperature, or salary) by finding the mathematical relationship between input features and the target.

Here is a step-by-step guide and a complete code example showing how to build, train, and evaluate a Linear Regression model the **right way** using data splitting and evaluation metrics.

---

### Step-by-Step Implementation

1. **Import the necessary modules:** You need the `LinearRegression` model, tools to split your data (`train_test_split`), and metrics to evaluate how good your model is (`mean_squared_error`, `r2_score`).
2. **Prepare your data:** Separate your inputs (`X`) from your output (`y`).
3. **Split into Training & Testing sets:** Train the model on one portion of data, and test it on unseen data to see how it performs in the real world.
4. **Train the model:** Call `.fit()` on the training data.
5. **Evaluate:** Check the model's accuracy using metrics like R-squared ($R^2$).

---

### Python Code Example

```python
import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# 1. Create a sample dataset (House prices based on Square Feet and Bedrooms)
data = {
    'Square_Feet': [1400, 1600, 1700, 1875, 2100, 2350, 2450, 2600, 2900, 3100],
    'Bedrooms': [2, 2, 3, 3, 3, 4, 3, 4, 4, 5],
    'Price': [240000, 270000, 290000, 315000, 350000, 390000, 400000, 420000, 470000, 500000]
}
df = pd.DataFrame(data)

# 2. Define Features (X) and Target (y)
X = df[['Square_Feet', 'Bedrooms']]
y = df['Price']

# 3. Split data: 80% for training, 20% for testing
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# 4. Initialize and Train (Fit) the Linear Regression model
model = LinearRegression()
model.fit(X_train, y_train)

# 5. Make predictions on the test set
y_pred = model.predict(X_test)

# 6. Evaluate the model
print(f"Intercept: {model.intercept_:.2f}")
print(f"Coefficients (Weights): {model.coef_}")
print(f"R-squared Score: {r2_score(y_test, y_pred):.2f}") # Closer to 1.0 is better
print(f"Root Mean Squared Error: {np.sqrt(mean_squared_error(y_test, y_pred)):,.2f}")

# 7. Predict a brand new house
new_house = [[2200, 3]]
predicted_price = model.predict(new_house)
print(f"\nPredicted Price for 2,200 sq ft & 3 bedrooms: ${predicted_price[0]:,.2f}")

```

---

### Key Takeaways

* **`model.coef_`**: Shows how much each feature impacts the price (e.g., how much price increases per extra square foot).
* **`model.intercept_`**: The baseline price when all features are zero.
* **$R^2$ Score**: Tells you how well your model explains the variance in the data. A score of `1.0` means a perfect fit.

Are you trying to apply Linear Regression to a specific dataset you are currently working with?