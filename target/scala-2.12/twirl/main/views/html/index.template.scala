
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

/**/
class index @javax.inject.Inject() /*1.6*/(webJarsUtil: org.webjars.play.WebJarsUtil) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import views.html.main


Seq[Any](_display_(/*4.2*/main("Scala Coders Team", webJarsUtil)/*4.40*/ {_display_(Seq[Any](format.raw/*4.42*/("""

  """),format.raw/*6.3*/("""<!-- Navigation -->
  <div class="wrap">
    <div class="container">
      <div class="row">
        <div class="col-md-6 text-center">
          <p class="mb-0 mt-1 phone pl-md-2">
            <a href="#" class="mr-2"><span class="fa fa-phone mr-1"></span> +998 99 4461230</a>
            <a href="#"><span class="fa fa-paper-plane mr-1"></span> behruz.ravshonbekovich@gmail.com</a>
          </p>
        </div>
        <div class="col-md-6 text-center">
          <div class="social-media">
            <p class="mb-0 d-flex">
              <a href="#" class="d-flex align-items-center justify-content-center"><span class="fab fa-facebook-square"><i class="sr-only">Facebook</i></span></a>
              <a href="#" class="d-flex align-items-center justify-content-center"><span class="fab fa-telegram"><i class="sr-only">
                Telegram</i></span></a>
              <a href="#" class="d-flex align-items-center justify-content-center"><span class="fab fa-telegram"><i class="sr-only">
                telegram</i></span></a>
              <a href="#" class="d-flex align-items-center justify-content-center"><span class="fab fa-github"><i class="sr-only">
                Github</i></span></a>
              <a href="#" class="d-flex align-items-center justify-content-center"><span class="fab fa-skype"><i class="sr-only">
                Skype</i></span></a>
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="mainNav">
    <div class="container">
      <a class="navbar-brand" href="/"><span class="flaticon-pawprint-1 mr-2"></span>Scala Coders Team</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="fa fa-bars"></span> Menu
      </button>
      <div class="collapse navbar-collapse" id="ftco-nav">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active"><a href="/" class="nav-link">Home</a></li>
          <li class="nav-item"><a href="#portfolio" class="nav-link">Portfolio</a></li>
          <li class="nav-item"><a href="#services" class="nav-link">Services</a></li>
          <li class="nav-item"><a href="#about" class="nav-link">About</a></li>
          <li class="nav-item"><a href="#team" class="nav-link">Team</a></li>
          <li class="nav-item"><a href="#contact" class="nav-link">Contact</a></li>
        </ul>
      </div>
    </div>
  </nav>

    <!-- Header -->
  <header class="masthead">
    <div class="container">
      <div class="intro-text">
        <div class="intro-lead-in">Welcome To Our Team!</div>
        <div class="intro-heading text-uppercase">It's Nice To Meet You</div>
        <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#services">Tell Me More</a>
      </div>
    </div>
  </header>
  <a id="backToTopBtn"><i class="fa fa-angle-up fa-3x"></i></a>

    <!-- Portfolio Grid -->
  <section class="bg-light page-section" id="portfolio">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Portfolio</h2>
          <h3 class="section-subheading text-muted">The projects we created.</h3>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal1">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src=""""),_display_(/*82.42*/routes/*82.48*/.Assets.versioned("images/portfolio/timetable.jpg")),format.raw/*82.99*/(""""  alt="#">
          </a>
          <div class="portfolio-caption">
            <h4><a href="#">TimeTable</a></h4>
            <p class="text-muted">Scala, HTML5, CSS3, CoffeeScript, PostgreSQL</p>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal2">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src=""""),_display_(/*96.42*/routes/*96.48*/.Assets.versioned("images/portfolio/01.jpg")),format.raw/*96.92*/("""" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>ProgrammersBoard</h4>
            <p class="text-muted">Scala, HTML5, CSS3, CoffeeScript, PostgreSQL</p>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal3">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src=""""),_display_(/*110.42*/routes/*110.48*/.Assets.versioned("images/portfolio/02.jpg")),format.raw/*110.92*/("""" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>ConguratulationBot</h4>
            <p class="text-muted">Scala, HTML5, CSS3, CoffeeScript, PostgreSQL</p>
          </div>
        </div>
      </div>
    </div>
  </section>


  <!-- Services -->

    <!--<section class="page-section" id="services">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Services</h2>
          <h3 class="section-subheading text-muted">We offer the following services.</h3>
        </div>
      </div>
      <div class="row text-center">
        <div class="col-md-4">
          <span class="fa-stack fa-4x">
            <i class="fas fa-circle fa-stack-2x text-primary"></i>
            <i class="fas fa-laptop-code fa-stack-1x fa-inverse"></i>
          </span>
          <h4 class="service-heading">Functional Project</h4>
          <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>
        </div>
        <div class="col-md-4">
          <span class="fa-stack fa-4x">
            <i class="fas fa-circle fa-stack-2x text-primary"></i>
            <i class="fas fa-laptop fa-stack-1x fa-inverse"></i>
          </span>
          <h4 class="service-heading">Responsive Design</h4>
          <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>
        </div>
        <div class="col-md-4">
          <span class="fa-stack fa-4x">
            <i class="fas fa-circle fa-stack-2x text-primary"></i>
            <i class="fas fa-lock fa-stack-1x fa-inverse"></i>
          </span>
          <h4 class="service-heading">Web Security</h4>
          <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>
        </div>
      </div>
    </div>
  </section>-->

      <section class="c-section page-section" id="services">
        <h2 class="c-section__title"><span>Our Services</span></h2>
        <ul class="c-services">
          <li class="c-services__item">
            <h3>Responsive Web Design</h3>
            <p>We leverage the concept of mobile-first design. Through our work, we focus on designing an experience that works across different screen sizes.</p>
          </li>
          <li class="c-services__item">
            <h3>UX Auditing</h3>
            <p>If you are unsure of how your app behaves, we can help by doing a detailed UX audit that will highlight most of the issues in your product. From there, we can take it further and fix all issues.</p>
          </li>
          <li class="c-services__item">
            <h3>Front End Development</h3>
            <p>We are Front End masters with a deep focus on HTML, CSS. The result of our work is a responsive, accessible, and performant websites. Either you have the design ready and want us to code it, or you want us to do both design and code, we&rsquo;re happy to do so.</p>
          </li>
          <li class="c-services__item">
            <h3>UX Consultation</h3>
            <p>If you don&rsquo;t know what kind of service to request from us, don&rsquo;t worry. We can help and see what fits your business and your budget.</p>
          </li>
          <li class="c-services__item">
            <h3>Web Site Design</h3>
            <p>To reach more customers and the goals of your business, a website is necessary these days. We will work on the website design from scratch to final tested prototype.</p>
          </li>
          <li class="c-services__item">
            <h3>UX Research</h3>
            <p>It&rsquo;s important to research deeply for the product you want to build. We help in that by defining the user audience, working on user stories, competitive analysis and much more. </p>
          </li>
        </ul>
      </section>
    </body>
  </html>


    <!-- About -->
  <section class="page-section" id="about">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">About</h2>
          <h3 class="section-subheading text-muted">The programming languages and technologies we use.</h3>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-12">
          <ul class="timeline">
            <li>
              <div class="timeline-image">
                <img class="rounded-circle img-fluid" src=""""),_display_(/*208.61*/routes/*208.67*/.Assets.versioned("images/about/frontend.png")),format.raw/*208.113*/("""" alt="">
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="subheading">Frontend</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!</p>
                </div>
              </div>
            </li>
            <li class="timeline-inverted">
              <div class="timeline-image">
                <img class="rounded-circle img-fluid" src=""""),_display_(/*221.61*/routes/*221.67*/.Assets.versioned("images/about/backend.png")),format.raw/*221.112*/("""" alt="">
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="subheading">Backend</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!</p>
                </div>
              </div>
            </li>
            <li>
              <div class="timeline-image">
                <img class="rounded-circle img-fluid" src=""""),_display_(/*234.61*/routes/*234.67*/.Assets.versioned("images/about/others.png")),format.raw/*234.111*/("""" alt="">
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="subheading">Others</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt ut voluptatum eius sapiente, totam reiciendis temporibus qui quibusdam, recusandae sit vero unde, sed, incidunt et ea quo dolore laudantium consectetur!</p>
                </div>
              </div>
            </li>
            <li class="timeline-inverted">
              <div class="timeline-image">
                <h4>Let's <br>Get <br>In Touch!</h4>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </section>

    <!-- Team -->
  <section class="bg-light page-section" id="team">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Our Amazing Team</h2>
          <h3 class="section-subheading text-muted">Members of our wonderful team.</h3>
        </div>
      </div>

      <div class="row flex-row flex-nowrap horizontal-scroll">
          <!-- Boltayev Behruzbek -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*270.55*/routes/*270.61*/.Assets.versioned("images/team/behruzbek.jpg")),format.raw/*270.107*/("""" alt="#">
            <h4>Boltayev Behruzbek</h4>
            <p class="text-muted">Middle Full-Stack Developer & DevOps Engineer</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://www.facebook.com/profile.php?id=100006190087236">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/Behruz_Boltayev">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/behruz-b">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Rahmatov Maftunbek -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*295.55*/routes/*295.61*/.Assets.versioned("images/team/maftunbek.jpg")),format.raw/*295.107*/("""" alt="#">
            <h4>Rahmatov Maftunbek</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://www.facebook.com/prince.rmd">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/prince_rmd">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/Prince951-17/">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Jumaniyozov Surojiddin -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*320.55*/routes/*320.61*/.Assets.versioned("images/team/surojiddin.jpg")),format.raw/*320.108*/("""" alt="">
            <h4>Jumaniyozov Surojiddin</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://facebook.com/isurojiddin">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/isurojiddin">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/isurojiddin">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Aminov Abduvali -->
          <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*345.55*/routes/*345.61*/.Assets.versioned("images/team/Abdubvali.jpg")),format.raw/*345.107*/("""" alt="#">
            <h4>Aminov Abduvali</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://www.facebook.com/aminov.abduvali/">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/abduvali_aminov">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/abduvali98">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Yo'ldashev Bekturdi -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*370.55*/routes/*370.61*/.Assets.versioned("images/team/bekturdi.jpg")),format.raw/*370.106*/("""" alt="">
            <h4>Yo'ldashev Bekturdi</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://www.facebook.com/bekturdi.yuldashev">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/Yuldashev_B1">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/Bekturdi/">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Jumanazarov Javlon -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*395.55*/routes/*395.61*/.Assets.versioned("images/team/javlon.jpg")),format.raw/*395.104*/("""" alt="">
            <h4>Jumanazarov Javlon</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://www.facebook.com/jumanazarov.javlon">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/JJ5862">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/jumanazarov5862">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Babayev Shohruxbek -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*420.55*/routes/*420.61*/.Assets.versioned("images/team/Shohrux.jpg")),format.raw/*420.105*/("""" alt="#">
            <h4>Babayev Shohruxbek</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="https://www.facebook.com/profile.php?id=100022319020538">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/babayevshohruxbek">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/Shohruxbek2001">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
          <!-- Yaqubov Yunusbek -->
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src=""""),_display_(/*445.55*/routes/*445.61*/.Assets.versioned("images/team/Yunusbek.jpg")),format.raw/*445.106*/("""" alt="#">
            <h4>Yaqubov Yunusbek</h4>
            <p class="text-muted">Full-Stack Master</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://t.me/yunusbek99">
                  <i class="fab fa-telegram"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="https://github.com/yunusbek1710">
                  <i class="fab fa-github"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
              <!-- Shomurotov Og`abek -->
          <div class="col-sm-4">
              <div class="team-member">
                  <img class="mx-auto rounded-circle" src=""""),_display_(/*470.61*/routes/*470.67*/.Assets.versioned("images/team/og%60abek.jpg")),format.raw/*470.113*/("""" alt="#">
                  <h4>Shomurotov Og`abek</h4>
                  <p class="text-muted">Full-Stack Master</p>
                  <ul class="list-inline social-buttons">
                      <li class="list-inline-item">
                          <a href="https://www.facebook.com/rasmus.lerdorf.165">
                              <i class="fab fa-facebook"></i>
                          </a>
                      </li>
                      <li class="list-inline-item">
                          <a href="https://t.me/fullstackmaster007">
                              <i class="fab fa-telegram"></i>
                          </a>
                      </li>
                      <li class="list-inline-item">
                          <a href="https://github.com/Arash4567">
                              <i class="fab fa-github"></i>
                          </a>
                      </li>
                  </ul>
              </div>
          </div>
      </div>

      <div class="row">
        <div class="col-lg-8 mx-auto mt-3 text-center">
          <p class="large text-muted">Our team consists of enthusiastic and enthusiastic young programmers. They have knowledge and strong experience in several programming languages.</p>
        </div>
      </div>
    </div>
  </section>

    <!-- Clients -->
    <!--  <section class="py-5">-->
    <!--    <div class="container">-->
    <!--      <div class="row">-->
    <!--        <div class="col-md-3 col-sm-6">-->
    <!--          <a href="#">-->
    <!--            <img class="img-fluid d-block mx-auto" src="img/logos/envato.jpg" alt="">-->
    <!--          </a>-->
    <!--        </div>-->
    <!--        <div class="col-md-3 col-sm-6">-->
    <!--          <a href="#">-->
    <!--            <img class="img-fluid d-block mx-auto" src="img/logos/designmodo.jpg" alt="">-->
    <!--          </a>-->
    <!--        </div>-->
    <!--        <div class="col-md-3 col-sm-6">-->
    <!--          <a href="#">-->
    <!--            <img class="img-fluid d-block mx-auto" src="img/logos/themeforest.jpg" alt="">-->
    <!--          </a>-->
    <!--        </div>-->
    <!--        <div class="col-md-3 col-sm-6">-->
    <!--          <a href="#">-->
    <!--            <img class="img-fluid d-block mx-auto" src="img/logos/creative-market.jpg" alt="">-->
    <!--          </a>-->
    <!--        </div>-->
    <!--      </div>-->
    <!--    </div>-->
    <!--  </section>-->

    <!-- Contact -->
  <section class="page-section" id="contact">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-lg-8 text-center">
          <h2 class="text-white mt-0">Let's Get In Touch!</h2>
          <hr class="divider my-4">
          <p class="text-white mb-5">Ready to start your next project with us? Give us a call or send us an email and we will get back to you as soon as possible!</p>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-4 ml-auto text-center mb-5 mb-lg-0">
          """),format.raw/*542.65*/("""
          """),format.raw/*543.11*/("""<svg class="mb-3 text-white" width="50px" height="50px" style="fill: white" viewBox="-96 0 512 512" xmlns="http://www.w3.org/2000/svg"><path d="m159.808594 456.066406c-8.164063 0-14.808594 6.644532-14.808594 14.808594s6.644531 14.804688 14.808594 14.804688c8.164062 0 14.804687-6.644532 14.804687-14.804688 0-8.164062-6.640625-14.808594-14.804687-14.808594zm0 15.683594c-.484375 0-.878906-.394531-.878906-.875 0-.484375.394531-.878906.878906-.878906.480468 0 .875.394531.875.878906 0 .480469-.394532.875-.875.875zm0 0"/><path d="m271.714844 0h-14.847656c-4.140626 0-7.5 3.359375-7.5 7.5s3.359374 7.5 7.5 7.5h14.847656c18.140625 0 32.898437 14.757812 32.898437 32.898438v16.230468h-289.613281v-16.230468c0-18.140626 14.757812-32.898438 32.898438-32.898438h179.207031c4.140625 0 7.5-3.359375 7.5-7.5s-3.359375-7.5-7.5-7.5h-179.207031c-26.410157 0-47.898438 21.488281-47.898438 47.898438v416.203124c0 26.414063 21.488281 47.898438 47.898438 47.898438h223.816406c26.410156 0 47.898437-21.484375 47.898437-47.898438v-416.203124c0-26.410157-21.484375-47.898438-47.898437-47.898438zm0 497h-223.816406c-18.140626 0-32.898438-14.757812-32.898438-32.898438v-384.972656h289.613281v351.070313h-266.972656c-4.144531 0-7.5 3.359375-7.5 7.5s3.355469 7.5 7.5 7.5h266.972656v18.902343c0 18.140626-14.757812 32.898438-32.898437 32.898438zm0 0"/><path d="m108.128906 289.898438c1.464844 1.464843 3.382813 2.195312 5.304688 2.195312 1.917968 0 3.835937-.730469 5.300781-2.195312 2.929687-2.929688 2.929687-7.679688 0-10.605469l-32.226563-32.230469 32.226563-32.226562c2.929687-2.929688 2.929687-7.679688 0-10.605469-2.925781-2.929688-7.675781-2.929688-10.605469 0l-37.53125 37.53125c-1.40625 1.402343-2.199218 3.3125-2.199218 5.300781s.792968 3.898438 2.199218 5.304688zm0 0"/><path d="m200.878906 289.898438c1.464844 1.464843 3.382813 2.195312 5.304688 2.195312 1.917968 0 3.835937-.730469 5.300781-2.195312l37.53125-37.53125c2.929687-2.929688 2.929687-7.679688 0-10.605469l-37.53125-37.53125c-2.929687-2.929688-7.675781-2.929688-10.605469 0-2.929687 2.925781-2.929687 7.675781 0 10.605469l32.230469 32.226562-32.230469 32.230469c-2.929687 2.925781-2.929687 7.675781 0 10.605469zm0 0"/><path d="m143.351562 321.976562c.488282.09375.972657.140626 1.453126.140626 3.511718 0 6.648437-2.476563 7.351562-6.054688l26.539062-135.109375c.796876-4.0625-1.851562-8.003906-5.914062-8.804687-4.066406-.792969-8.007812 1.851562-8.804688 5.914062l-26.539062 135.109375c-.800781 4.0625 1.847656 8.007813 5.914062 8.804687zm0 0"/></svg>
          <div class="text-white">+998 99 4461230</div>
        </div>
        <div class="col-lg-4 mr-auto text-center">
          """),format.raw/*547.68*/("""
          """),format.raw/*548.11*/("""<svg version="1.1" id="Capa_1" class="mb-3 text-white" width="50px" height="50px" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
          viewBox="0 0 511.974 511.974" style="enable-background:new 0 0 511.974 511.974; fill: white" xml:space="preserve">
            <g>
              <g>
                <g>
                  <path d="M511.872,195.725c-0.053-0.588-0.17-1.169-0.35-1.732c-0.117-0.503-0.28-0.994-0.486-1.468
				c-0.239-0.463-0.525-0.901-0.853-1.306c-0.329-0.481-0.71-0.924-1.135-1.323c-0.137-0.119-0.196-0.282-0.341-0.401
				l-82.065-63.735V59.704c0-14.138-11.462-25.6-25.6-25.6h-92.476L271.539,5.355c-9.147-7.134-21.974-7.134-31.121,0
				l-37.035,28.749h-92.476c-14.138,0-25.6,11.461-25.6,25.6v66.057L3.268,189.496c-0.145,0.12-0.205,0.282-0.341,0.401
				c-0.425,0.398-0.806,0.842-1.135,1.323c-0.328,0.405-0.614,0.842-0.853,1.306c-0.207,0.473-0.369,0.965-0.486,1.468
				c-0.178,0.555-0.295,1.127-0.35,1.707c0,0.179-0.102,0.333-0.102,0.512V486.37c0.012,5.428,1.768,10.708,5.009,15.061
				c0.051,0.077,0.06,0.171,0.119,0.239c0.06,0.068,0.188,0.145,0.273,0.239c4.794,6.308,12.25,10.027,20.173,10.061h460.8
				c7.954-0.024,15.441-3.761,20.241-10.103c0.068-0.085,0.171-0.111,0.23-0.196c0.06-0.085,0.068-0.162,0.12-0.239
				c3.241-4.354,4.997-9.634,5.009-15.061V196.237C511.974,196.058,511.881,195.904,511.872,195.725z M250.854,18.82
				c2.98-2.368,7.2-2.368,10.18,0l19.686,15.283h-49.493L250.854,18.82z M27.725,494.904l223.13-173.321
				c2.982-2.364,7.199-2.364,10.18,0l223.189,173.321H27.725z M494.908,481.6L271.539,308.117c-9.149-7.128-21.972-7.128-31.121,0
				L17.041,481.6V209.233L156.877,317.82c3.726,2.889,9.088,2.211,11.977-1.515c2.889-3.726,2.211-9.088-1.515-11.977
				L25.276,194.018l60.032-46.652v65.937c0,4.713,3.821,8.533,8.533,8.533c4.713,0,8.533-3.821,8.533-8.533v-153.6
				c0-4.713,3.82-8.533,8.533-8.533h290.133c4.713,0,8.533,3.82,8.533,8.533v153.6c0,4.713,3.82,8.533,8.533,8.533
				s8.533-3.821,8.533-8.533v-65.937l60.032,46.652l-142.31,110.507c-2.448,1.855-3.711,4.883-3.305,7.928s2.417,5.637,5.266,6.786
				c2.849,1.149,6.096,0.679,8.501-1.232l140.083-108.774V481.6z"/>
                  <path d="M358.374,204.77v-34.133c0-56.554-45.846-102.4-102.4-102.4c-56.554,0-102.4,45.846-102.4,102.4
				s45.846,102.4,102.4,102.4c4.713,0,8.533-3.82,8.533-8.533s-3.82-8.533-8.533-8.533c-47.128,0-85.333-38.205-85.333-85.333
				s38.205-85.333,85.333-85.333s85.333,38.205,85.333,85.333v34.133c0,9.426-7.641,17.067-17.067,17.067
				s-17.067-7.641-17.067-17.067v-34.133c0-4.713-3.82-8.533-8.533-8.533s-8.533,3.82-8.533,8.533
				c0,18.851-15.282,34.133-34.133,34.133c-18.851,0-34.133-15.282-34.133-34.133s15.282-34.133,34.133-34.133
				c4.713,0,8.533-3.82,8.533-8.533s-3.82-8.533-8.533-8.533c-22.915-0.051-43.074,15.13-49.354,37.168
				c-6.28,22.038,2.847,45.565,22.347,57.601c19.5,12.036,44.622,9.65,61.507-5.843c1.858,18.046,17.543,31.464,35.659,30.505
				C344.25,237.91,358.431,222.912,358.374,204.77z"/>
                </g>
              </g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
            <g>
            </g>
          </svg>
            <!-- Make sure to change the email address in anchor text AND the link below! -->
          <a class="d-block text-white" href="mailto:behruz.ravshonbekovich@gmail.com">behruz.ravshonbekovich@gmail.com</a>
        </div>
      </div>
    </div>
  </section>

    <!-- Footer -->
  <footer class="footer py-3">
    <div class="container">
      <div class="small text-center text-muted">Copyright &copy; 2020 - Scala Coders Team</div>
    </div>
  </footer>

    <!-- Portfolio Modals -->

    <!-- Modal 1 -->
  <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="close-modal" data-dismiss="modal">
          <div class="lr">
            <div class="rl"></div>
          </div>
        </div>
        <div class="container">
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <div class="modal-body">
                  <!-- Project Details Go Here -->
                <h2 class="text-uppercase">Time Table</h2>
                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                <img class="img-fluid d-block mx-auto" src=""""),_display_(/*643.62*/routes/*643.68*/.Assets.versioned("images/portfolio/timetable.jpg")),format.raw/*643.119*/("""" alt="#">
                <p>Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                <ul class="list-inline">
                  <li>Date: December 2019</li>
                  <li>Client: UBTUIT</li>
                  <li>Category: Functional Project</li>
                </ul>
                <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times"></i> Close Project</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

    <!-- Modal 2 -->
  <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="close-modal" data-dismiss="modal">
          <div class="lr">
            <div class="rl"></div>
          </div>
        </div>
        <div class="container">
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <div class="modal-body">
                  <!-- Project Details Go Here -->
                <h2 class="text-uppercase">Programmers Board</h2>
                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                <img class="img-fluid d-block mx-auto" src=""""),_display_(/*675.62*/routes/*675.68*/.Assets.versioned("images/portfolio/01.jpg")),format.raw/*675.112*/("""" alt="#">
                <p>Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                <ul class="list-inline">
                  <li>Date: January 2020</li>
                  <li>Client: UBTUIT</li>
                  <li>Category: Functional Project</li>
                </ul>
                <button class="btn btn-primary" data-dismiss="modal" type="button">
                  <i class="fas fa-times"></i>
                  Close Project</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

    <!-- Modal 3 -->
  <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="close-modal" data-dismiss="modal">
          <div class="lr">
            <div class="rl"></div>
          </div>
        </div>
        <div class="container">
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <div class="modal-body">
                  <!-- Project Details Go Here -->
                <h2 class="text-uppercase">Conguratulation Bot</h2>
                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                <img class="img-fluid d-block mx-auto" src=""""),_display_(/*709.62*/routes/*709.68*/.Assets.versioned("images/portfolio/02.jpg")),format.raw/*709.112*/("""" alt="#">
                <p>Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                <ul class="list-inline">
                  <li>Date: January 2017</li>
                  <li>Client: Finish</li>
                  <li>Category: Identity</li>
                </ul>
                <button class="btn btn-primary" data-dismiss="modal" type="button">
                  <i class="fas fa-times"></i>
                  Close Project</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

    <!-- Bootstrap core JavaScript -->

""")))}),format.raw/*729.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-03T22:40:50.463385
                  SOURCE: /home/yoshhacker/IdeaProjects/portfolio/app/views/index.scala.html
                  HASH: 8fa07852e8cc241e4b93cd62d826834cbea8fb26
                  MATRIX: 473->5|800->50|875->54|926->78|972->116|1011->118|1041->122|4847->3902|4862->3908|4934->3959|5553->4551|5568->4557|5633->4601|6242->5182|6258->5188|6324->5232|10997->9877|11013->9883|11082->9929|11821->10640|11837->10646|11905->10691|12617->11375|12633->11381|12700->11425|14118->12815|14134->12821|14203->12867|15224->13860|15240->13866|15309->13912|16286->14861|16302->14867|16372->14914|17343->15857|17359->15863|17428->15909|18407->16860|18423->16866|18491->16911|19470->17862|19486->17868|19552->17911|20530->18861|20546->18867|20613->18911|21612->19882|21628->19888|21696->19933|22648->20857|22664->20863|22733->20909|25802->24003|25842->24014|28506->26706|28546->26717|33385->31530|33401->31536|33475->31587|35026->33110|35042->33116|35109->33160|36698->34721|36714->34727|36781->34771|37643->35602
                  LINES: 19->1|22->2|25->3|28->4|28->4|28->4|30->6|106->82|106->82|106->82|120->96|120->96|120->96|134->110|134->110|134->110|232->208|232->208|232->208|245->221|245->221|245->221|258->234|258->234|258->234|294->270|294->270|294->270|319->295|319->295|319->295|344->320|344->320|344->320|369->345|369->345|369->345|394->370|394->370|394->370|419->395|419->395|419->395|444->420|444->420|444->420|469->445|469->445|469->445|494->470|494->470|494->470|566->542|567->543|571->547|572->548|667->643|667->643|667->643|699->675|699->675|699->675|733->709|733->709|733->709|753->729
                  -- GENERATED --
              */
          