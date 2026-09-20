from sklearn.datasets import load_iris

iris_dataset=load_iris()


X_train,X_test, y_train,y_test=train_test_split(iris_dataset['data'],iris_dataset['target'],random_state=0) 

print('X_train shape {}'.format(X_train.shape))
print('y_train shape {}'.format(y_train.shape))