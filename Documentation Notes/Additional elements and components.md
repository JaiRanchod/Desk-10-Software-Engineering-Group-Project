<h1 align="center">Additional Elements and Components</h1>

<p>&nbsp;&nbsp;&nbsp;&nbsp;One of the key ideas that we all agreed on was that we wanted the user eperience to be smooth and visually pleasing. Considering that the very first levels of interaction with our web app is the sign up process, we decided to explore third party applications that deliver the user experience we sought. Taking into account that the time frame to develop this application was relatively tight and our coding eperience low, seeking help from third party tools in the early stages was critical in helping us get the head start we needed!</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;After considering a range of options we decided to implement **Typeform**. Typeform is a web application that allows the creation of engaging and interactive data forms to capture user information. Its robust form builder and template designer, allowed us to quickly design, test and launch an onboarding process that was ready for production in a matter of hours. One of the key benefits of using a 3rd party app is that we could simply add a one line embedd code to our web app and instantly have an auto responcive onboarding process.</p>

```html
  <iframe class="iframe" width="100%" height="850" src="https://form.typeform.com/to/<typeformID>?typeform-medium=embed-snippet" frameborder="0" allowfullscreen data-transparency="100"></iframe>

```

<h2 align="center">To Summarise, <b>The Benefits of Using Typeform</b> Are:</h2>

- It's quick to create, edit and test
- It's easy to embed in any platform
- It has open api access

<h2 align="center">Some of <b>the Downsides</b> Are:</h2>

- We needed to find a way to connect it with our database
- We didn't have a way to check field entry in real time

<p>&nbsp;&nbsp;&nbsp;&nbsp;To integrate typeform submissions with our mongoDB database we needed to make use of typeform's api. Once again, our initial experience with this was minimal so we discovered and leveraged the help of an online tool which helps connect two api endpoints and make requests in an intuitive interface. **Integromat** allowed us to connect typeform with mongoDB and within a couple days we had a working onboarding interface that was connected with mongoDB. Using Integromat, not only helped us launch our integration in a short period of time, it also showed us how the webhooks and api calls transfer or capture data through JSON format by POST, GET etc.</p>

![](https://i.ibb.co/kx58mLx/Screenshot-2021-04-29-at-14-29-10.png)

<p>&nbsp;&nbsp;&nbsp;&nbsp;This learning experience led to our better understanding and confidence in implementing our service API within the app to communicate back and forth with mongoDB.</p>

<h2 align="center">To Summarise, <b>the Benefits of Using Integromat</b> Are:</h2>

- Easy to authenticate API connections
- Easy to to create JSON based data fields
- A helpful introduction and learning experience in understanding how API's are used

<p>&nbsp;&nbsp;&nbsp;&nbsp;In terms of downsides, there isn't anything we can say that impacted the quality or output of our work. The only point we could mention is that using partially Integromat to handle API's and manually doing it through the web app for the rest of its functionality may have cause some confusion in certain circumstances. However, looking at the bigger picture, Integromat allowed us to quickly and effectively meet our needs whilst also providing us with that learning curve that set the foundations for future API work.</p>
