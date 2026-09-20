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

