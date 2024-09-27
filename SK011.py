import keras
import tensorflow as tf
X = tf.constant([[0,0],[0,1],[1,0],[1,1]])
y = tf.constant([0,1,1,0])

model = keras.models.Sequential(name="XOR")
input = keras.layers.Input(shape=(2,))
model.add(input)
layer1 = keras.layers.Dense(units=4,activation='sigmoid',name='Layer1')
model.add(layer1)
layer2 = keras.layers.Dense(units=2,activation='sigmoid',name='Layer2')
model.add(layer2)
output = keras.layers.Dense(units=1,activation='sigmoid',name='OUTPUT')
model.add(output)
print(model.summary())

model.compile(loss='mse',optimizer=keras.optimizers.SGD(learning_rate=0.8))
model.fit(X,y,epochs=5000,verbose=2)
print(model.predict(X))
model.save('XORGATE.keras')