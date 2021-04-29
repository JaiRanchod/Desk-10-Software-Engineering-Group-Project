### Additional elements and components

One of the key ideas that we all agreed on was that we wanted the user eperience to be smooth and visually pleasing. Considering that the very first levels of interaction with our web app is the sign up process, we decided to explore third party applications that deliver the user experience we sought. Taking into account that the time frame to develop this application was relatively tight and our coding eperience low, seeking help from third party tools in the early stages was critical in helping us get the head start we needed!

After considering a range of options we decided to implement **Typeform**. Typeform is a web application that allows the creation of engaging and interactive data forms to capture user information. Its robust form builder and template designer, allowed us to quickly design, test and launch an onboarding process that was ready for production in a matter of hours. One of the key benefits of using a 3rd party app is that we could simply add a one line embedd code to our web app and instantly have an auto responcive onboarding process.

```html
  <iframe class="iframe" width="100%" height="850" src="https://form.typeform.com/to/<typeformID>?typeform-medium=embed-snippet" frameborder="0" allowfullscreen data-transparency="100"></iframe>

```

To summarise, the benefits of using typeform are:

- It's quick to create, edit and test
- It's easy to embed in any platform
- It has open api access

Some of the downsides are:

- We needed to find a way to connect it with our database
- We didn't have a way to check field entry in real time

To integrate typeform submissions with our mongoDB database we needed to make use of typeform's api. Once again, our initial experience with this was minimal so we discovered and leveraged the help of an online tool which helps connect two api endpoints and make requests in an intuitive interface. **Integromat** allowed us to connect typeform with mongoDB and within a couple days we had a working onboarding interface that was connected with mongoDB. Using Integromat, not only helped us launch our integration in a short period of time, it also showed us how the webhooks and api calls transfer or capture data through JSON format by POST, GET etc.

![](https://i.ibb.co/kx58mLx/Screenshot-2021-04-29-at-14-29-10.png)

This learning experience led to our better understanding and confidence in implementing our service API within the app to communicate back and forth with mongoDB
