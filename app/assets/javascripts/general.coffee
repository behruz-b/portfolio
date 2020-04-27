$ ->
  vm = ko.mapping.fromJS

  $btn = $('#backToTopBtn')
  $navbar = document.getElementById('mainNav')
  $sticky = $navbar.offsetTop


  myFunction = ->
    if window.pageYOffset > $sticky
      $navbar.classList.add 'sticky-top'
    else
      $navbar.classList.remove 'sticky-top'
    return

  $(window).scroll ->
    myFunction()
    if $(window).scrollTop() > 300
      $btn.addClass 'show'
    else
      $btn.removeClass 'show'

  $btn.on 'click', (e) ->
    e.preventDefault()
    $('html, body').animate { scrollTop: 0 }, '300'

  ko.applyBindings {vm}