from sklearn.datasets import load_iris
iris_dataset=load_iris()


print(iris_dataset.keys())
print("\n ----------------- values -------------------\n\n")

# print(iris_dataset.values())


# print(iris_dataset['DESCR'])
print('\nDESCR :193 ',iris_dataset['DESCR'][:193]+"\n")
print('\ntarget_names ',iris_dataset['target_names'])

